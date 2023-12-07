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

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.Date;

public class ModelAlamat {

    /*
        Ketentuan:
        * Diawali huruf kapital
        * Sisanya huruf kecil dan nomor saja (kombinasi)
        * Min 8 karakter Max 16 karakter
     */

    @NotNull
    @NotEmpty
    @NotBlank
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Length(min = 10, max = 20)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@#$%^&(){}:;<>,.?/~_+-=|]).{8,16}$", message = "Tidak valid!")

    private LocalDate contohTanggal; // yyyy-MM-dd
    private Date contohTanggalWaktu; // yyyy-MM-dd HH:mm:ss.SSS
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
