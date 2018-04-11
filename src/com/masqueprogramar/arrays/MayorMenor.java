package com.masqueprogramar.arrays;

import java.util.Random;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-abril-2018
 * @description Programa que, dado un array de 10 enteros (aleatorios entre el -10 y el 10), calcule el mayor valor y el menor valor     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/11/mayor-menor-array-java/ 
 */

public class MayorMenor {

	private static int[] numeros;

	public static void main(String[] args) {
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		numeros = new int[10];
		llenarArray();
		for (int i = 0; i < numeros.length; i++) {
			mayor = Integer.max(mayor, numeros[i]);
			menor = Integer.min(menor, numeros[i]);
		}
		System.out.printf("El mayor valor es %d y el menor es %d.", mayor, menor);
	}

	private static void llenarArray() {
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(21) - 10;
		}
	}
}
