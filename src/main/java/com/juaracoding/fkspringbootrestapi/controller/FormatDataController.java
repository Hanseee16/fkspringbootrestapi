package com.juaracoding.fkspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 02/12/2023 17:32
@Last Modified 02/12/2023 17:32
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.CalonPeserta;
import com.juaracoding.fkspringbootrestapi.model.FormatData;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Style;
import java.util.List;

@RestController
@RequestMapping("api/formdata")

public class FormatDataController {

    @PostMapping("/v1/convertjson")
    public Object getDataJSON(@RequestBody FormatData formatData) {

        /*
            1. Validasi content type
            2. Bongkar isi body
            3. Mapping field dari body ke wadah atau penampung
            4. Bungkus lalu jadikan format utuh class Object nya
         */

        System.out.println("Masuk kesini");
        return formatData;
    }

    @PostMapping("/v1/seleksi")
    public String seleksiCalonPeserta(@RequestBody List<CalonPeserta> calonPeserta) {

        for (int i = 0; i < calonPeserta.size(); i++) {
            System.out.println("Nama i ke "+i+" : "+calonPeserta.get(i).getNama());
            System.out.println("Umur i ke "+i+" : "+calonPeserta.get(i).getUmur());
            System.out.println("Nilai i ke "+i+" : "+calonPeserta.get(i).getNilai());
            System.out.println("=============");
        }
        return "Sudah oke!";
    }

    @PostMapping("/v1/seleksi2")
    public String seleksiCalonPeserta2(
            @RequestParam(value = "nama") String strNama,
            @RequestParam(value = "umur") Integer intUmur,
            @RequestParam(value = "nilai") Double douNilai
    ) {
        if (douNilai > 80 && intUmur >= 18 && intUmur <= 60) {
            return strNama + " Lolos Seleksi";
        } else {
            return strNama + " Tidak lolos seleksi";
        }
    }
}
