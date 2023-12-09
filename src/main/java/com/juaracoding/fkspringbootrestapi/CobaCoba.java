package com.juaracoding.fkspringbootrestapi;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Hanseee a.k.a. Farhan Kamil
Java Developer
Created on 09/12/2023 17:39
@Last Modified 09/12/2023 17:39
Version 1.0
*/

public class CobaCoba {
    public static void main(String[] args) {
        int intX = 3;
        char chX = (char) intX;
        System.out.println(chX);
    }

    public Boolean testAja() {

        String strInput = "Ab12@cdE";
        int intInput = strInput.length();
        char chX = 'X';
        boolean isUpper = false;
        boolean isLower = false;
        boolean isNumeric = false;
        boolean isSpecial = false;
        boolean isLength = false;
        for (int i = 0; i < intInput; i++) {
            chX = strInput.charAt(i);
            if (chX > 96 && chX < 123) {//untuk cek huruf kecil
                isLower = true;
            }
            if (chX > 65 && chX < 92) {//untuk cek huruf Besar
                isUpper = true;
            }
            if (chX > 41 && chX < 50) {//cek nomor
                isNumeric = true;
            }
            if (chX > 30 && chX < 65) {//untuk cek spesial karakter
                isSpecial = true;
            }
        }
        return false;
    }
}
