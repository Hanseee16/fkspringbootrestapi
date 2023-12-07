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
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "MstPeserta")

public class ModelPeserta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NamaPeserta", columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    @Length(min = 10, max = 20)
    private String nama;

    @Column(name = "Batch", columnDefinition = ConstantClassPeserta.COL_DEF_BACTH)
    private String batch;

    @Column(name = "AlamatPeserta", columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    private String alamat;

    private  Boolean booleanValid;
    private Double doubleValid;
    private Short shortValid;
    private Byte byteValid;
    private Float floatValid;
    private Character characterValid;

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

    public Boolean getBooleanValid() {
        return booleanValid;
    }

    public void setBooleanValid(Boolean booleanValid) {
        this.booleanValid = booleanValid;
    }

    public Double getDoubleValid() {
        return doubleValid;
    }

    public void setDoubleValid(Double doubleValid) {
        this.doubleValid = doubleValid;
    }

    public Short getShortValid() {
        return shortValid;
    }

    public void setShortValid(Short shortValid) {
        this.shortValid = shortValid;
    }

    public Byte getByteValid() {
        return byteValid;
    }

    public void setByteValid(Byte byteValid) {
        this.byteValid = byteValid;
    }

    public Float getFloatValid() {
        return floatValid;
    }

    public void setFloatValid(Float floatValid) {
        this.floatValid = floatValid;
    }

    public Character getCharacterValid() {
        return characterValid;
    }

    public void setCharacterValid(Character characterValid) {
        this.characterValid = characterValid;
    }
}

