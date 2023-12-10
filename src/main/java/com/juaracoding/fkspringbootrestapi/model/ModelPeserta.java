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
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity
@Table(name = "MstPeserta")

public class ModelPeserta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NamaPeserta", nullable = false, columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    @NotNull(message = "TIDAK BOLEH NULL")
    @NotEmpty(message = "TIDAK BOLEH KOSONG")
    @NotBlank(message = "TIDAK BOLEH BLANK")
//    @Pattern(regexp = "^[a-zA-Z0-9]{10,20}$]",
//            message = "TIDAK BOLEH MENGANDUNG SPESIAL KARAKTER MINIMAL 10 MAXSIMAL 20 KARAKTER")
    @Length(min = 10, max = 20)
    private String nama;

    @Column(name = "Batch", columnDefinition = ConstantClassPeserta.COL_DEF_BACTH)
    private String batch;

    @Column(name = "AlamatPeserta", columnDefinition = ConstantClassPeserta.COL_DEF_NAMA)
    private String alamat;

    @NotNull(message = "TIDAK BOLEH NULL")
//    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate tanggalLahir;

    @Transient
    private Integer umur;

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

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getUmur() {
        return Period.between(tanggalLahir, LocalDate.now()).getYears();
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}

