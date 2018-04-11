package com.masqueprogramar.arrays;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-abril-2018
 * @description Programa que, dado un array de 10 enteros (introducidos en el código), calcule la media e indique cuántos valores están por encima de la media y cuántos por debajo      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/10/media-enteros-array-java/ 
 */

public class MediaNumeros {

	public static void main(String[] args) {
		int[] numeros = {3, 4, 7, 9, 12, 15, 17, 5, 89, 103};
		double media;
		int suma = 0;
		int contSup = 0, contInf = 0;
		for (int i=0; i<numeros.length; i++) {
			suma += numeros[i];
		}
		media = (double)suma / numeros.length;
		for (int i=0; i<numeros.length; i++) {
			if(numeros[i]<media)
				contInf++;
			if(numeros[i]>media)
				contSup++;
		}
		System.out.println("La media es: " + media);
		System.out.println("Número de valores por debajo de la media: " + contInf);
		System.out.println("Número de valores por encima de la media: " + contSup);
	}
}
