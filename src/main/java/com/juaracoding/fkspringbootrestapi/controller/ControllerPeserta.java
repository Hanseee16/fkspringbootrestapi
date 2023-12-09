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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peserta")
public class ControllerPeserta {
    @Autowired
    RepoPeserta repoPeserta;
    @Autowired
    CobaCoba cobaCoba;

    @GetMapping("/v1/getall")
    public List<ModelPeserta> getAllData() {
        List<ModelPeserta> modelPesertaList = repoPeserta.findAll();
        return modelPesertaList;
    }

    @PostMapping("/v1/save")
    public String postData(@RequestBody ModelPeserta modelPeserta) {
        repoPeserta.save(modelPeserta);
        return modelPeserta.getNama() + " berhasil ditambahkan";
    }
}