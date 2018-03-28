package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 27-marzo-2018
 * @description Programa que dada una cadena introducida por teclado la invierta       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/27/invertir-cadena-iterativo/
 */

public class InvertirCadenaIterativo {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Introduce una cadena de texto: ");
		String cadena = sc.nextLine();
		sc.close();
		String invertida = invertirCadena(cadena);
		String invertidaReverse = invertirCadenaReverse(cadena);
		System.out.printf("Cadena introducida: %s", cadena);
		System.out.printf("%nCadena invertida: %s", invertida);
		System.out.printf("%nCadena invertida reverse: %s", invertidaReverse);
	}

	private static String invertirCadena(String cadena) {
		String invertida = "";
		for(int i=cadena.length()-1;i>=0;i--){
			invertida = invertida + cadena.charAt(i);
		}
		return invertida;
	}
	
	private static String invertirCadenaReverse(String cadena){
		StringBuilder builder = new StringBuilder(cadena);
		return builder.reverse().toString();
	}
}
