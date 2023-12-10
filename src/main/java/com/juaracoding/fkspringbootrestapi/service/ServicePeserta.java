package com.juaracoding.fkspringbootrestapi.service;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 09/12/2023 18:46
@Last Modified 09/12/2023 18:46
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelPeserta;
import com.juaracoding.fkspringbootrestapi.repo.RepoPeserta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Service
@Transactional
public class ServicePeserta {

    RepoPeserta repoPeserta;

    @Autowired
    public ServicePeserta(RepoPeserta repoPeserta) {
        this.repoPeserta = repoPeserta;
    }

    public Object updateData(Long id, ModelPeserta modelPeserta) {
        Optional<ModelPeserta> listModelPeserta = repoPeserta.findById(id);

        if (listModelPeserta.isEmpty()) {
            return "User Tidak Ada!";
        }

        ModelPeserta peserta = listModelPeserta.get();
        peserta.setNama(modelPeserta.getNama());
        peserta.setAlamat(modelPeserta.getAlamat());
        peserta.setTanggalLahir(modelPeserta.getTanggalLahir());
        peserta.setBatch(modelPeserta.getBatch());

        return "Update Data Berhasil!";
    }
}
