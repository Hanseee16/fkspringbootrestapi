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

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "MstAlamat")

public class ModelAlamat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @NotEmpty
    @NotBlank
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Length(min = 10, max = 20)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:;<>,.?/~_+-=|]).{8,16}$", message = "Tidak valid!")

    @Column(name = "", unique = false, insertable = false, updatable = true)
    private String jalan;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate contohTanggal;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date contohTanggalWaktu;
    private Integer nomor;
    private String kota;
    private Integer kodePos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getContohTanggal() {
        return contohTanggal;
    }

    public void setContohTanggal(LocalDate contohTanggal) {
        this.contohTanggal = contohTanggal;
    }

    public Date getContohTanggalWaktu() {
        return contohTanggalWaktu;
    }

    public void setContohTanggalWaktu(Date contohTanggalWaktu) {
        this.contohTanggalWaktu = contohTanggalWaktu;
    }

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
