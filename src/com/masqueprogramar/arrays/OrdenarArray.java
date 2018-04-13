package com.masqueprogramar.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 13-abril-2018
 * @description Programa que pida al usuario un array de números enteros y ordene los elementos de menor a mayor       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/13/ordenar-array-java/ 
 */

public class OrdenarArray {
	
	static Scanner sc = new Scanner(System.in);
	static int[] numeros;
	
	public static void main(String[] args) {
		
		numeros = new int[leerEntero("Introduce la dimension del array: ")];
		llenarArray();
		System.out.println("\n\nArray");
		visualizar();
		System.out.println("\n\nArray ordenado");
        Arrays.sort(numeros);
        visualizar();
	}
	
	private static void llenarArray(){
		for(int i=0;i<numeros.length;i++){
			numeros[i] = leerEntero("Inserta el valor " + (i+1) + ": ");
		}
	}
	
	private static void visualizar(){
		for (int num : numeros) {
			System.out.print(num + " ");
		}
	}
	
	private static int leerEntero(String s){
		System.out.print(s);
        return sc.nextInt();	
	}
}
