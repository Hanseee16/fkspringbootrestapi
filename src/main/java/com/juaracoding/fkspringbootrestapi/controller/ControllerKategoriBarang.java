package com.juaracoding.fkspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 18/12/2023 14:10
@Last Modified 18/12/2023 14:10
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelKategoriBarang;
import com.juaracoding.fkspringbootrestapi.service.ServiceKategoriBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kategoriBarang")
public class ControllerKategoriBarang {

    ServiceKategoriBarang serviceKategoriBarang;

    @Autowired
    public ControllerKategoriBarang(ServiceKategoriBarang serviceKategoriBarang) {
        this.serviceKategoriBarang = serviceKategoriBarang;
    }

    @PostMapping("v1/save")
    public Object save(@RequestBody ModelKategoriBarang modelKategoriBarang) {
        return serviceKategoriBarang.save(modelKategoriBarang);
    }

    @PostMapping("v1/saveBatch")
    public Object saveBatch(@RequestBody List<ModelKategoriBarang> listModelKategoriBarang) {
        return serviceKategoriBarang.saveBatch(listModelKategoriBarang);
    }
}
