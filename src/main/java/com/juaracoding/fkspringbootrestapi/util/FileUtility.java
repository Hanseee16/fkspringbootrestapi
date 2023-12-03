package com.juaracoding.fkspringbootrestapi.util;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 03/12/2023 17:41
@Last Modified 03/12/2023 17:41
Version 1.0
*/

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.web.multipart.MultipartFile;

public class FileUtility {
    public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile) throws IOException {
        Path uploadPath = Paths.get(uploadDir); // set folder untuk upload file
        if (!Files.exists(uploadPath)) { // cek apakah folder ada
            Files.createDirectories(uploadPath); // jika folder tidak ada, maka buatkan foldernya
        }
        try (InputStream inputStream = multipartFile.getInputStream()) { // convert dari multipart ke inputstream
            Path filePath = uploadPath.resolve(fileName); // masuk ke Object path
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING); // proses copu dengan atribut replace yang ada
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
    }
}

