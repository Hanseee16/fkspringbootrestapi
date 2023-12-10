package com.juaracoding.fkspringbootrestapi.configuration;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 08/12/2023 17:17
@Last Modified 08/12/2023 17:17
Version 1.0
*/

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMain {

    @Bean
    public ModelMapper modelMapper() {

        return new ModelMapper();
    }
}
