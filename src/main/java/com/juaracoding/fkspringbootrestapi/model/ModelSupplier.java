package com.juaracoding.fkspringbootrestapi.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 16/12/2023 17:14
@Last Modified 16/12/2023 17:14
Version 1.0
*/

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MstSupplier")

public class ModelSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSupplier")
    private Long id;

    @Column(name = "NamaSupplier")
    private String namaSupplier;

    @ManyToMany
    @JoinTable(
            name = "MapSupplierBarang",
            joinColumns = {@JoinColumn(name = "IDSupplier", referencedColumnName = "IDSupplier")},
            inverseJoinColumns = {@JoinColumn(name = "IDBarang", referencedColumnName = "IDBarang")},
            uniqueConstraints = @UniqueConstraint(columnNames = {"IDSupplier", "IDBarang"})
    )

    private List<ModelBarang> modelBarangList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public List<ModelBarang> getModelBarangList() {
        return modelBarangList;
    }

    public void setModelBarangList(List<ModelBarang> modelBarangList) {
        this.modelBarangList = modelBarangList;
    }
}
