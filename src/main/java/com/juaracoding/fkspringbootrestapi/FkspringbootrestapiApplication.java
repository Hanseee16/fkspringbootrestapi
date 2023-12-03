package com.juaracoding.fkspringbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FkspringbootrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FkspringbootrestapiApplication.class, args);
	}
	public Boolean testAjA() {
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

		if (isUpper && isLower && isNumeric && isSpesial && (intInput > 7 && intInput < 17)) {
			return true;
		} else {
			return false;
		}
	}
}
