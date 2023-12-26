package com.juaracoding.fkspringbootrestapi.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 11/12/2023 01:04
@Last Modified 11/12/2023 01:04
Version 1.0
*/

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MstBarang")
public class ModelBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDBarang")
    private Long id;
    private String namaBarang;

    @ManyToOne
    @JoinColumn(name = "IDKategoriBarang", foreignKey = @ForeignKey(name = "fkBarangToKategori1"))
    private ModelKategoriBarang modelKategoriBarang;

    @ManyToMany(mappedBy = "modelBarangList")
    private List<ModelSupplier> modelSupplierList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public ModelKategoriBarang getModelKategoriBarang() {
        return modelKategoriBarang;
    }

    public void setModelKategoriBarang(ModelKategoriBarang modelKategoriBarang) {
        this.modelKategoriBarang = modelKategoriBarang;
    }

    public List<ModelSupplier> getModelSupplierList() {
        return modelSupplierList;
    }

    public void setModelSupplierList(List<ModelSupplier> modelSupplierList) {
        this.modelSupplierList = modelSupplierList;
    }
}
