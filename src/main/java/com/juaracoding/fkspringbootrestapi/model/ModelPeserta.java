package com.juaracoding.fkspringbootrestapi.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 03/12/2023 23:45
@Last Modified 03/12/2023 23:45
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.constant.ConstantClassPeserta;

import javax.persistence.*;

@Entity
@Table(name = "MstPeserta")

public class ModelPeserta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NamaPeserta", columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    private String nama;

    @Column(name = "Batch", columnDefinition = ConstantClassPeserta.COL_DEF_BACTH)
    private String batch;

    @Column(name = "AlamatPeserta", columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    private String alamat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

