package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 26-marzo-2018
 * @description Programa que dada una cadena introducida por teclado la invierta de forma recursiva       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/26/invertir-cadena-recursivo/
 */

public class InvertirCadenaRecursivo {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Introduce una cadena de texto: ");
		String cadena = sc.nextLine();
		sc.close();
		String invertida = invertirCadena(cadena);
		System.out.printf("Cadena introducida: %s%n", cadena);
		System.out.printf("Cadena invertida: %s", invertida);
	}
	
	private static String invertirCadena(String cadena){
		if(cadena.length()==1){
			return cadena;
		} else {
			return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
		}
	}
}
