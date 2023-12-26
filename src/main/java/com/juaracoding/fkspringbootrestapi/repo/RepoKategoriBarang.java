package com.juaracoding.fkspringbootrestapi.repo;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 18/12/2023 13:57
@Last Modified 18/12/2023 13:57
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelKategoriBarang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoKategoriBarang extends JpaRepository<ModelKategoriBarang, Long> {

}
