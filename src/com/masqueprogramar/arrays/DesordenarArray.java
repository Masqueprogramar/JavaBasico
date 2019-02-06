package com.masqueprogramar.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 05-febrero-2019
 * @description Programa que desordene los elementos de un array       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/02/05/desordenar-elementos-array
 */


public class DesordenarArray {

	public static void main(String[] args) {
		
		Random r = new Random();
		Integer[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; no podemos pasarlo a List
						
		System.out.println(Arrays.asList(arrayEnteros));
		
		// 1º método: posición aleatoria
		for (int i=0; i<arrayEnteros.length; i++) {
		    int posAleatoria = r.nextInt(arrayEnteros.length);
		    int temp = arrayEnteros[i];
		    arrayEnteros[i] = arrayEnteros[posAleatoria];
		    arrayEnteros[posAleatoria] = temp;
		}
		
		System.out.println(Arrays.toString(arrayEnteros));
		
		
		// 2º método: Collection.shuffle 
		List<Integer> lista = Arrays.asList(arrayEnteros);
		Collections.shuffle(lista);
		System.out.println(lista);
		
		lista.toArray(arrayEnteros);

	}

}
