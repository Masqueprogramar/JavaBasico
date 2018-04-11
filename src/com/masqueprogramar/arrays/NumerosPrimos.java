package com.masqueprogramar.arrays;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-abril-2018
 * @description Programa que, dado un array de 10 enteros (aleatorios entre el 0 y el 100), nos diga cuántos números primos contiene      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/11/numeros-primos-array-java/ 
 */

import java.util.Random;

public class NumerosPrimos {
	
	static int numeros[];
	
	public static void main(String[] args) {
		numeros = new int[10];
		inicializar();
		int cont=0;
		for (int i=0; i<numeros.length; i++) {
			if(esPrimo(numeros[i])){
				System.out.println("Número primo: " + numeros[i]);
				cont++;
			}
		}
		System.out.printf("%nTotal números primos: %d", cont);
		
	}
	
	private static boolean esPrimo(int num){
		boolean primo = (num==1)?false:true;
		int divisor=2;
		while(primo && divisor<num/2){
			if(num%divisor==0){
				primo = false;
			}
			divisor++;
		}
		return primo;
	}
	
	private static void inicializar() {
		Random r = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(100) + 1;
		}
	}
}
