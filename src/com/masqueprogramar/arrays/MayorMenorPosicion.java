package com.masqueprogramar.arrays;

import java.util.Random;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-abril-2018
 * @description Programa que, dado un array de 10 enteros (aleatorios entre el -10 y el 10), calcule la posición del mayor valor y la del menor valor     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/11/posicion-mayor-menor-array-java/ 
 */

public class MayorMenorPosicion {
	
	private static int[] numeros;

	public static void main(String[] args) {
		numeros = new int[10];
		llenarArray();
		visualizar();
		int mayor = numeros[0];
		int menor = numeros[0];
		int posMenor = 0, posMayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>mayor){
				mayor = numeros[i];
				posMayor = i;
			}
			if(numeros[i]<menor){
				menor = numeros[i];
				posMenor = i;
			}
		}
		System.out.printf("%nEl mayor valor es el %d y está en la posición %d"
				+ " y el menor es el %d y está en la posición %d.", 
				mayor, posMayor, menor, posMenor);
	}

	private static void llenarArray() {
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(21) - 10;
		}
	}
	
	private static void visualizar(){
		String cadena = "Array: ";
		for (int i = 0; i < numeros.length; i++) {
			cadena += numeros[i] + ", ";
		}
		cadena = cadena.substring(0, cadena.length()-2);
		System.out.println(cadena);
	}
}
