package com.juaracoding.fkspringbootrestapi.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 02/12/2023 18:40
@Last Modified 02/12/2023 18:40
Version 1.0
*/

public class Alamat {
    private String jalan;
    private Integer nomor;
    private String kota;
    private Integer kodePos;

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Integer getKodePos() {
        return kodePos;
    }

    public void setKodePos(Integer kodePos) {
        this.kodePos = kodePos;
    }
}
