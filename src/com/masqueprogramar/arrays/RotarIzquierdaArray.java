package com.masqueprogramar.arrays;

import java.util.Arrays;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 18-abril-2018
 * @description Programa que dado un array de números enteros rote sus posiciones a la izquierda       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/18/rotar-izquierda-array-java/ 
 */

public class RotarIzquierdaArray {
	
	private static int[] numeros = {1, 2, 3, 4, 5};

	public static void main(String[] args) {
		System.out.println("Array");
		visualizar();
        rotarIzda();
        System.out.println("\nArray rotado a la izquierda");
        visualizar();
        System.out.println("\n\ntoString: " + numeros.toString());
        System.out.println("\nArrays.toString: " + Arrays.toString(numeros));
	}
	
	private static void rotarIzda(){
		int aux = numeros[0];
		for (int i = 0; i < numeros.length-1; i++) {
			numeros[i] = numeros[i+1];
		}
		numeros[numeros.length-1] = aux;
	}

	private static void visualizar() {
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
