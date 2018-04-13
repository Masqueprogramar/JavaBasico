package com.masqueprogramar.arrays;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 13-abril-2018
 * @description Programa en el que se pidan al usuario dos arrays de números enteros y se construya el array resultado de “concatenar” los arrays       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/13/concatenar-array-java/ 
 */

public class ConcatenarArrays {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] array1 = new int[leerEntero("Dimension del primer array: ")];
        int[] array2 = new int[leerEntero("Dimension del segundo array: ")];
        int[] arrayConcatenado = new int[array1.length+array2.length];
        System.out.println("\nIntroduciendo valores primer array");
        llenarArray(array1);
        System.out.println("Primer array");
        visualizar(array1);
        System.out.println();
        System.out.println("\nIntroduciendo valores segundo array");
        llenarArray(array2);        
        System.out.println("Segundo array");
        visualizar(array2);
        System.out.println();
        concatenarArrays(array1, array2, arrayConcatenado);
        System.out.println("\nArray resultante");
        visualizar(arrayConcatenado);
        
        //Otra forma con arraycopy
        int[] arrayConcatenado2 = new int[array1.length+array2.length];
        System.arraycopy(array1, 0, arrayConcatenado2, 0, array1.length);
        System.arraycopy(array2, 0, arrayConcatenado2, array1.length, array2.length);
        System.out.println("\nArray resultante arraycopy");
        visualizar(arrayConcatenado2);
	}
	
	private static void concatenarArrays(int[] array1, int[] array2,
			int[] arrayConcatenado) {
		for (int i = 0; i<array1.length; i++) {
			arrayConcatenado[i] = array1[i]; 
		}
		
		for (int i = 0, j=array1.length; i<array2.length; i++, j++) {
			arrayConcatenado[j] = array2[i];
		}
	}

	private static void llenarArray(int[] pArray){
		for(int i=0;i<pArray.length;i++){
			pArray[i] = leerEntero("Inserta el valor " + (i+1) + ": ");
		}
	}
	
	private static void visualizar(int[] pArray){
		for (int i=0; i<pArray.length; i++) {
			System.out.print(pArray[i] + " ");
		}
	}
	
	private static int leerEntero(String s){
		System.out.print(s);
        int num = sc.nextInt();
        return num;	
	}

}
