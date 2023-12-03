package com.juaracoding.fkspringbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FkspringbootrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FkspringbootrestapiApplication.class, args);
	}
	public Boolean testAjA() {
		/*
			UNTUK VALIDASI PASSWORD

			Ketentuan:
			* 1 huruf kecil
			* 1 huruf besar
			* 1 angka
			* 1 spesial karakter.
			Min 8 karakter max 16 karakter

			Ab@1 = false (tidak valid)
			Test 1 = A1@ABCDE -> (ekspektasi) false (tanpa huruf kecil)
			Test 2 = a1@abcde -> (ekspektasi) false (tanpa huruf besar)
			Test 3 = a1aabcde -> (ekspektasi) false (tanpa spesial karakter)
			Test 4 = aA@aabcde -> (ekspektasi) false (tanpa angka)
			Test 5 = aA@aabcde -> (ekspektasi) false (lebih dari min dan max)
			Test 6 = 12@112345 -> (ekspektasi) false (tanpa huruf kecil dan besar)
		 */

		String strInput = "Ab12@cdE";
		int intInput = strInput.length();
		char chaX = 'X';
		boolean isUpper = false;
		boolean isLower = false;
		boolean isNumeric = false;
		boolean isSpesial = false;

		for (int i = 0; i < intInput; i++) {
			chaX = strInput.charAt(i);

			// untuk cek huruf kecil
			if (chaX > 96 && chaX < 123) {
				isLower = true;
			}

			// untuk cek huruf besar
			if (chaX > 65 && chaX < 92) {
				isUpper = true;
			}

			// untuk cek angka
			if (chaX > 41 && chaX < 50) {
				isNumeric = true;
			}

			// untuk cek spesial karakter
			if (chaX > 30 && chaX < 64) {
				isSpesial = true;
			}
		}

//		if (isUpper && isLower && isNumeric && isSpesial && (intInput > 7 && intInput < 17)) {
//			return true;
//		} else {
//			return false;
//		}

		// [567] -> 5 atau 6 atau 7
		// [0-9] -> 0,1,2,3,4,5,6,7,8,9
		// [567][0-9] -> 50 - 79

		// 62(812|813|821)
		String strX = "62812";
		if ("62812".equals(strX) || "62813".equals(strX) || "62821".equals(strX)) {
			System.out.println("Oke!");
		}
		return false;
	}
}
