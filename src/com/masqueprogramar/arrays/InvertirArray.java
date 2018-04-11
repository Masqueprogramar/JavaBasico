package com.masqueprogramar.arrays;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-abril-2018
 * @description Programa que dado un array de enteros (introducidos en el código) invierta sus valores       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/10/invertir-array-java/ 
 */

public class InvertirArray {
	
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		visualizar(numeros);
		int aux;
		
		//1ª forma: Sin array auxiliar
		for (int i=0; i<numeros.length/2; i++) {
			aux = numeros[i];
			numeros[i] = numeros[numeros.length-1-i];
			numeros[numeros.length-1-i] = aux;
		}
		visualizar(numeros);
		
		//2ª forma: Con array auxiliar, for 1 variable
		int[] invertido = new int[numeros.length];
		for(int i=0;i<numeros.length;i++){
			invertido[i] = numeros[numeros.length-1-i];
		}
        numeros = invertido;
        visualizar(numeros);
        
        //3ª forma: Con array auxiliar, for 2 variables
        invertido = new int[10];
        for (int i=0, j=numeros.length-1; i<numeros.length; i++, j--) {
			invertido[j] = numeros[i];
		}
		numeros = invertido;
		visualizar(numeros);
	}
	
	private static void visualizar(int[] array){
		String cadena = "Array: ";
		for (int i = 0; i < array.length; i++) {
			cadena += array[i] + ", ";
		}
		cadena = cadena.substring(0, cadena.length()-2);
		System.out.println(cadena);
	}
}
