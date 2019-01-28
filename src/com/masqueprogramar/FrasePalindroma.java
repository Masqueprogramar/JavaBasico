package com.masqueprogramar;

import java.text.Normalizer;
import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 24-enero-2019
 * @description Programa que introducida una frase por teclado nos diga si es palíndroma o no       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/24/frase-palindroma-java
 */

public class FrasePalindroma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase por teclado: ");
		String frase = sc.nextLine();
		sc.close();
		
		// normalizar la frase (quitar las tildes)
		frase = cleanString(frase);
		
		// quitar los espacios en blanco
		frase = frase.replace(" ", "");
		
		StringBuilder sb = new StringBuilder(frase).reverse();
		
		if(frase.equalsIgnoreCase(sb.toString())){
			System.out.println("\nLa frase es palíndroma.");
		} else {
			System.out.println("\nLa frase no es palíndroma.");
		}		

	}
	
	public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }

}
