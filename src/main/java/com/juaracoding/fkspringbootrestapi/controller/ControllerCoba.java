package com.juaracoding.fkspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 30/11/2023 23:04
@Last Modified 30/11/2023 23:04
Version 1.0
*/

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/main")

public class ControllerCoba {

    @GetMapping("/v1/welcome")
    public String welcome() {
        System.out.println("Data berhasil masuk!");
        return "Hello Hanseee";
    }

    @GetMapping("/v1/save")
    public String save() {
        System.out.println("Save kesini");
        return "Data berhasil disimpan!";
    }

    @GetMapping("/v1/update")
    public String update() {
        System.out.println("Update kesini");
        return "Data berhasil diupdate!";
    }

    @GetMapping("/v1/delete")
    public String delete() {
        System.out.println("Delete kesini");
        return "Data berhasil dihapus!";
    }

    @GetMapping("/v1/find")
    public String findBy() {
        System.out.println("Update kesini");
        return "Data berhasil difind!";
    }

    @GetMapping("/v1/contohdata")
    public Map<String, Object> contohData() {
        Map<String, Object> map = new HashMap<>();
        map.put("nama", "Farhan Kamil");
        map.put("jenis_kelamin", "Pria");
        map.put("status", HttpStatus.CREATED.value());
        return map;
    }
}
