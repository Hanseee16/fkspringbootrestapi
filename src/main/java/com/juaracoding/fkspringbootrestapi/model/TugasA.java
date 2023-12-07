package com.juaracoding.fkspringbootrestapi.model;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 06/12/2023 20:31
@Last Modified 06/12/2023 20:31
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.constant.ConstantClassTugasA;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MstTugasA")

public class TugasA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTugasA", nullable = true)
    private Integer id;

    @Column(name = "Nama", columnDefinition = ConstantClassTugasA.COL_DEF_Nama)
    private String nama;

    @Column(name = "ModelAlamat", columnDefinition = ConstantClassTugasA.COL_DEF_Alamat)
    private String alamat;

    @Column(name = "TanggalLahir", columnDefinition = ConstantClassTugasA.COL_DEF_TanggalLahir)
    private Date tanggalLahir;

    @Column(name = "JenisKelamin")
    private Character jenisKelamin;

    @Column(name = "MasihHidup")
    private Boolean masihHidup;

    @Column(name = "CreatedDate")
    private Date createdDate;

    @Column(name = "CreatedBy")
    private Integer createdBy;

    @Column(name = "ModifiedDate", nullable = false)
    private Date modifiedDate;

    @Column(name = "ModifiedBy", nullable = false)
    private Integer modifiedBy;

    @Column(name = "IsDelete")
    private Short isDelete;

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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Boolean getMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(Boolean masihHidup) {
        this.masihHidup = masihHidup;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}
