package com.juaracoding.fkspringbootrestapi.service;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 18/12/2023 13:57
@Last Modified 18/12/2023 13:57
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelKategoriBarang;
import com.juaracoding.fkspringbootrestapi.repo.RepoKategoriBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiceKategoriBarang {

    RepoKategoriBarang repoKategoriBarang;

    @Autowired
    public ServiceKategoriBarang(RepoKategoriBarang repoKategoriBarang) {
        this.repoKategoriBarang = repoKategoriBarang;
    }

    public Object save(ModelKategoriBarang modelKategoriBarang) {

        try {
            repoKategoriBarang.save(modelKategoriBarang);
        } catch (Exception e) {
            return "Data Gagal Disimpan!"+e.getMessage();
        }

        return "Data Berhasil Disimpan!";
    }

    public Object saveBatch(List<ModelKategoriBarang> listModelKategoriBarang) {

        try {
            repoKategoriBarang.saveAll(listModelKategoriBarang);
        } catch (Exception e) {
            return "Data Gagal Disimpan!"+e.getMessage();
        }

        return "Data Berhasil Disimpan!";
    }
}
