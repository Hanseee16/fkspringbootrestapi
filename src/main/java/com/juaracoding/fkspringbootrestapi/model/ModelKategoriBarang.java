package com.juaracoding.fkspringbootrestapi.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 11/12/2023 01:02
@Last Modified 11/12/2023 01:02
Version 1.0
*/

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MstKategoriBarang")
public class ModelKategoriBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKategoriBarang")
    private Long id;
    private String namaKategoriBarang;
    private String deskripsi;

    @OneToMany(mappedBy = "modelKategoriBarang")
    private List<ModelBarang> modelBarangList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaKategoriBarang() {
        return namaKategoriBarang;
    }

    public void setNamaKategoriBarang(String namaKategoriBarang) {
        this.namaKategoriBarang = namaKategoriBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public List<ModelBarang> getModelBarangList() {
        return modelBarangList;
    }

    public void setModelBarangList(List<ModelBarang> modelBarangList) {
        this.modelBarangList = modelBarangList;
    }
}
