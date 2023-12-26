package com.juaracoding.fkspringbootrestapi.service;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 26/12/2023 15:45
@Last Modified 26/12/2023 15:45
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelBarang;
import com.juaracoding.fkspringbootrestapi.repo.RepoBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ServiceBarang {

    private RepoBarang repoBarang;

    @Autowired
    public ServiceBarang(RepoBarang repoBarang) {
        this.repoBarang = repoBarang;
    }

    public Object save(ModelBarang modelBarang) {

        try {
            repoBarang.save(modelBarang);
        } catch (Exception e) {
            return "Data Gagal Disimpan!"+e.getMessage();
        }

        return "Data Berhasil Disimpan!";
    }
}
