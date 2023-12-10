package com.juaracoding.fkspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 08/12/2023 16:57
@Last Modified 08/12/2023 16:57
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.CobaCoba;
import com.juaracoding.fkspringbootrestapi.model.ModelPeserta;
import com.juaracoding.fkspringbootrestapi.repo.RepoPeserta;
import com.juaracoding.fkspringbootrestapi.service.ServicePeserta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/peserta")
public class ControllerPeserta {

    ServicePeserta servicePeserta;

    @Autowired
    public ControllerPeserta(ServicePeserta servicePeserta, RepoPeserta repoPeserta) {
        this.servicePeserta = servicePeserta;
        this.repoPeserta = repoPeserta;
    }

    @Autowired
    RepoPeserta repoPeserta;

    @GetMapping("/v1/getAll")
    public List<ModelPeserta> getAllData() {
        List<ModelPeserta> modelPesertaList = repoPeserta.findAll();
        return modelPesertaList;
    }

    @PostMapping("/v1/save")
    public String postData(@RequestBody ModelPeserta modelPeserta) {
        repoPeserta.save(modelPeserta);
        return modelPeserta.getNama() + " berhasil ditambahkan";
    }

    @GetMapping("/v1/searchById")
    public Object searchPesertaById(@RequestParam(value = "id") Long id) {

        // optional = mengembalikan hanya satu data
        Optional<ModelPeserta> hasil = repoPeserta.findById(id);

        if (hasil.isEmpty()) {
            return "Data Tidak Ada!";
        }

        ModelPeserta p = hasil.get();
        return p;
    }

    @GetMapping("/v1/searchByNama")
    public Object searchPesertaByNama(@RequestParam(value = "nama") String nama) {

        // list = mengembalikan beberapa data
        List<ModelPeserta> hasil = repoPeserta.findByNama(nama);

        if (hasil.isEmpty()) {
            return "Data Tidak Ada!";
        }
        return hasil;
    }

    @GetMapping("/v1/searchByNamaAndBatch")
    public Object searchPesertaByNamaAndBacth(
            @RequestParam(value = "nama") String nama,
            @RequestParam(value = "batch") String batch) {

        // list = mengembalikan beberapa data
        List<ModelPeserta> hasil = repoPeserta.findByNamaAndBatch(nama, batch);

        if (hasil.isEmpty()) {
            return "Data Tidak Ada!";
        }

        // COUNT
        System.out.println("COUNT = "+ repoPeserta.countByBatch(batch));

        // DELETE
//        System.out.println("PROSES DELETE AWAL");
//        repoPeserta.deleteByNama(nama);
//        System.out.println("PROSES DELETE AKHIR");

        // DISTINCT
        List<ModelPeserta> modelPesertaList = repoPeserta.findDistinctPesertaByBatch(batch);

        return hasil;
    }

    @PostMapping("/v1/validasi")
    public String testValidasi(@Valid @RequestBody ModelPeserta modelPeserta) {

        try {
            int intX = 1/0;
        } catch (Exception e) {
            return "Gagal" + e.getMessage();
        }

        System.out.println("TAHAN DISINI");
        return modelPeserta.getNama() + " berhasil ditambahkan";
    }

    @PostMapping("/v1/update/{id}")
    public String updateData(@Valid @RequestBody ModelPeserta modelPeserta, @PathVariable(value = "id") Long id) {
        System.out.println("Masuk Kesini!");
        return (String) servicePeserta.updateData(id, modelPeserta);
    }
}