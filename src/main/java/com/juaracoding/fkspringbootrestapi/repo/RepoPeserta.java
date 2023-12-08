package com.juaracoding.fkspringbootrestapi.repo;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 08/12/2023 16:47
@Last Modified 08/12/2023 16:47
Version 1.0
*/

import com.juaracoding.fkspringbootrestapi.model.ModelPeserta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPeserta extends JpaRepository<ModelPeserta, Long> {
}
