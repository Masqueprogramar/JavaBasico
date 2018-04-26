package com.masqueprogramar;

import java.util.Arrays;
import java.util.Random;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 20-abril-2018
 * @description Programa que muestra el tiempo empleado en la ejecución de los métodos para la búsqueda de repetidos en un array.     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/20/medir-tiempo-ejecucion-java/ 
 */

public class MedirTiempoEjecucion {
	
	static long tiempoInicio;
	static long tiempoFinal;
    	
	public static void main(String[] args) {
		int numeros[] = new int[100];
		llenarArray(numeros);
		visualizar(numeros);
		System.out.println("\nArray no ordenado");
		mostrarRepetidos(numeros);
		System.out.println("\nArray ordenado");
		mostrarRepetidosOrdenados(numeros);
	}
	
	static void mostrarRepetidos(int[] pArray){
		//Tiempo inicio
		tiempoInicio = System.nanoTime();
		for(int i=0;i<pArray.length-1;i++){
			for(int j=i+1;j<pArray.length;j++){
				if(pArray[i]==pArray[j]){
					System.out.println("Elemento repetido: " + pArray[i]);
				}
			}
		}
		//Tiempo final
		tiempoFinal = System.nanoTime();
		//Resta del tiempo final menos el tiempo de inicio
		System.out.println("Tiempo: " + (tiempoFinal-tiempoInicio) + " nanosegundos.");
	}
	
	static void mostrarRepetidosOrdenados(int[] pArray){
		//Tiempo de inicio
		tiempoInicio = System.nanoTime();
		Arrays.sort(pArray);
		for(int i=0;i<pArray.length-1;i++){
			if(pArray[i]==pArray[i+1]){
				System.out.println("Elemento repetido: " + pArray[i]);
			}
		}
		//Tiempo final
		tiempoFinal = System.nanoTime();
		//Resta del tiempo final menos el tiempo de inicio
		System.out.println("Tiempo: " + (tiempoFinal-tiempoInicio) + " nanosegundos.");
	}
	
	static void visualizar(int[] pArray){
		System.out.println(Arrays.toString(pArray));
	}
	
	static void llenarArray(int[] pArray){
		Random r = new Random();
		for(int i=0;i<pArray.length;i++){
			pArray[i] = r.nextInt(10000) + 1;
		}
	}
}
