package com.juaracoding.fkspringbootrestapi.repo;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 26/12/2023 15:43
@Last Modified 26/12/2023 15:43
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelBarang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoBarang extends JpaRepository <ModelBarang, Long> {
}