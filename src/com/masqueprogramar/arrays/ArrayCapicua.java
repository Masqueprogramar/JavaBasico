package com.masqueprogramar.arrays;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 13-abril-2018
 * @description Programa en el que se pida al usuario un array de números enteros e indique en pantalla si dicho array es capicúa       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/13/array-capicua-java/ 
 */

public class ArrayCapicua {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dim = leerNumero("Introduce la dimension del array: ");
        int[] numeros = new int[dim];
        llenarArray(numeros);
        visualizar(numeros);
        System.out.println();
        if(esCapicuaWhile(numeros))
            System.out.println("\nEl array es capicua");
        else
            System.out.println("\nEl array no es capicua");
	}
	
	private static boolean esCapicuaWhile(int[] pArray){
		boolean capicua = true;
		int aux = 0;
		while(aux<pArray.length/2 && capicua){
			if(pArray[aux]!=pArray[pArray.length-1-aux]){
				capicua = false;
			}
			aux++;
		}
		return capicua;
	}
	
	@SuppressWarnings("unused")
	private static boolean esCapicuaFor(int[] pArray){
		for (int i=0; i<pArray.length/2; i++) {
			if(pArray[i]!=pArray[pArray.length-1-i]){
				return false;
			}
		}
		return true;
	}
	
	private static void llenarArray(int[] pArray) {
		for (int i=0; i<pArray.length; i++) {
			pArray[i] = leerNumero("Introduce el valor " + (i+1) + ": ");
		}
	}

	private static void visualizar(int[] pArray) {
		for (int i=0; i<pArray.length; i++) {
			System.out.print(pArray[i] + " ");
		}
	}

	private static int leerNumero(String s){
		System.out.print(s);
        int num = sc.nextInt();
        return num;	
	}
}
