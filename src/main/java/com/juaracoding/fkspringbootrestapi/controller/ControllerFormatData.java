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

import com.juaracoding.fkspringbootrestapi.model.ModelCalonPeserta;
import com.juaracoding.fkspringbootrestapi.model.ModelFormatData;
import com.juaracoding.fkspringbootrestapi.util.FileUtility;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/formdata")

public class ControllerFormatData {

    @PostMapping("/v1/convertjson")
    public Object getDataJSON(@RequestBody ModelFormatData modelFormatData) {

        /*
            1. Validasi content type
            2. Bongkar isi body
            3. Mapping field dari body ke wadah atau penampung
            4. Bungkus lalu jadikan format utuh class Object nya
         */

        System.out.println("Masuk kesini");
        return modelFormatData;
    }

    @PostMapping("/v1/seleksi")
    public String seleksiCalonPeserta(@RequestBody List<ModelCalonPeserta> modelCalonPeserta) {
        for (int i = 0; i < modelCalonPeserta.size(); i++) {
            System.out.println("Nama i ke "+i+" : "+ modelCalonPeserta.get(i).getNama());
            System.out.println("Umur i ke "+i+" : "+ modelCalonPeserta.get(i).getUmur());
            System.out.println("Nilai i ke "+i+" : "+ modelCalonPeserta.get(i).getNilai());
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
        System.out.println(strNama);
        System.out.println(intUmur);
        System.out.println(douNilai);

        if (douNilai > 80 && intUmur >= 18 && intUmur <= 60) {
            return strNama + " Lolos Seleksi";
        } else {
            return strNama + " Tidak lolos seleksi";
        }
    }

    @PostMapping("/v1/seleksi3/{nama}/{umur}/{nilai}")
    public String seleksiCalonPeserta3(
            @PathVariable(value = "nama") String nama,
            @PathVariable(value = "umur") Integer umur,
            @PathVariable(value = "nilai") Double nilai
    ) {
        System.out.println(nama);
        System.out.println(umur);
        System.out.println(nilai);

        if (nilai > 80 && umur >= 18 && umur <= 60) {
            return nama + " Lolos Seleksi";
        } else {
            return nama + " Tidak lolos seleksi";
        }
    }

    // upload file
    @PostMapping("/kirim-file")
    public String submitFile(@RequestParam(value = "kiriman") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String uploadDir = "user-files/";
        FileUtility.saveFile(uploadDir, fileName, file);
        return "Berhasil mengunggah file " + fileName;
    }

}
