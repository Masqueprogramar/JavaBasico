package com.masqueprogramar.arrays;

import java.util.Arrays;

/**
* @author masqueprogramar (https://masqueprogramar.wordpress.com)
* @date 19-abril-2018
* @description Indicar si dos arrays son iguales, si tienen los mismos elementos en el mismo orden       
* @version 1.0
* @url https://masqueprogramar.wordpress.com/2018/04/19/arrays-iguales-java/ 
*/

public class ArraysIguales {

	public static void main(String[] args) {
		int[] array1 = {1, 3, 5, 7, 9};
		int[] array2 = {1, 3, 5, 7, 9};
		int[] array3 = {1, 3, 5, 6, 9};
		visualizar(array1);
		visualizar(array2);
		visualizar(array3);
		System.out.print("Arrays 1 y 2.");
		sonArraysIguales(array1, array2);
		System.out.print("Arrays 1 y 3.");
		sonArraysIguales(array1, array3);
	}
	
	static void sonArraysIguales(int[] array1, int[] array2){
		boolean iguales = (array1.length==array2.length);
		if(iguales){
			for(int i=0;i<array1.length && iguales;i++){
				if(array1[i]!=array2[i]){
					iguales = false;
				}
			}
		}
		if(iguales){
			System.out.println("Los 2 arrays son iguales.");
		} else {
			System.out.println("Los 2 arrays no son iguales.");
		}		
	}
	
	static void visualizar(int[] pArray){
		System.out.println(Arrays.toString(pArray));
	}
}
