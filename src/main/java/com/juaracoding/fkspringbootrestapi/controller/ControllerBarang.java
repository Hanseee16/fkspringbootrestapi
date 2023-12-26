package com.juaracoding.fkspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 26/12/2023 15:48
@Last Modified 26/12/2023 15:48
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelBarang;
import com.juaracoding.fkspringbootrestapi.model.ModelKategoriBarang;
import com.juaracoding.fkspringbootrestapi.service.ServiceBarang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/barang")
public class ControllerBarang {

    private ServiceBarang serviceBarang;

    @Autowired
    public ControllerBarang(ServiceBarang serviceBarang) {
        this.serviceBarang = serviceBarang;
    }

    @PostMapping("v1/save")
    public Object save(@RequestBody ModelBarang modelBarang) {
        return serviceBarang.save(modelBarang);
    }
}
