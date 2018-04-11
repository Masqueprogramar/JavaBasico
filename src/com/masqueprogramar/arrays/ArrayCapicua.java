package com.masqueprogramar.arrays;

import java.util.Scanner;

public class ArrayCapicua {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dim = leerNumero("Introduce la dimension del array: ");
        int[] numeros = new int[dim];
        llenarArray(numeros);
        visualizar(numeros);
        System.out.println();
        if(esCapicuaWhile(numeros))
            System.out.println("El array es capicua");
        else
            System.out.println("El array no es capicua");
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
