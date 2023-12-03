package com.juaracoding.fkspringbootrestapi.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 02/12/2023 17:39
@Last Modified 02/12/2023 17:39
Version 1.0
*/

import java.util.List;

public class FormatData {
    private Long id;
    private String nama;
    private String jenisKelamin;
    private Integer umur;

    private Alamat alamat;
    private List<Alamat> listAlamat;

    public List<Alamat> getListAlamat() {
        return listAlamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
