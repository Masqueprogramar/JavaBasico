package com.masqueprogramar.matematicas;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-enero-2019
 * @description Programa que dados una serie de números en un array, nos diga si cada uno tiene todos los dígitos diferentes o no.
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/14/digitos-diferentes-numero 
 */

public class DigitosDiferentes {

	public static void main(String[] args) {
		int arrayEnteros[] = {11, 20, 303, 4643, 5432};
		for(int i = 0; i<arrayEnteros.length; i++){
			if(comprobarDigitos(arrayEnteros[i])){
				System.out.printf("El número %d tiene todos los digitos distintos.%n", arrayEnteros[i]);
			} else {
				System.out.printf("El número %d no tiene todos los digitos distintos.%n", arrayEnteros[i]);
			}
		}
	}
	
	private static boolean comprobarDigitos(int num){
		boolean array[] = new boolean[10];
		for(int i=0; i < 10; i++){
			array[i] = false;
		}
		while (num > 0){
			int digito = num%10;
			if(array[digito])
				return false;
			
			array[digito] = true;
			num /= 10;
		}
		return true;
	}

}
