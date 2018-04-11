package com.masqueprogramar.arrays;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-abril-2018
 * @description Programa que dado un array de caracteres (introducidos en el código) calcule cuántas veces aparece la secuencia AB      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/10/secuencia-array-java/ 
 */

public class SecuenciaAB {
	
	public static void main(String[] args) {
		char[] letras = {'A','A','B','B','B','B','A','B','A','B'};
		int cont=0;
		for (int i=0;i<letras.length-1;i++) {
			if(letras[i]=='A' && letras[i+1]=='B'){
				cont++;
			}
		}
		System.out.print("La secuencia AB aparece " + cont);
		System.out.println(cont==1?" vez.":" veces.");
	}
}
