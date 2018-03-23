package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 22-marzo-2018
 * @description Programa que pide al usuario una serie de números naturales e indique si se tratan de "números perfectos"
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/22/numero-perfecto/ 
 */

public class NumeroPerfecto {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int numero;
		boolean perfecto;
		do {
			System.out.print("Introduce un número natural (negativo para terminar): ");
			numero = sc.nextInt();
			if(numero>0){
				perfecto = esNumeroPerfecto(numero);
				System.out.printf("El numero %d %s es un número perfecto.%n%n", numero, perfecto?"sí":"no");
			}
		} while (numero>=0);
		System.out.println("\nFin del programa");
	}
	
	public static boolean esNumeroPerfecto(int numero){
		int sumaDivisores = 0;
		for(int i=1;i<numero;i++){
			if(numero%i==0){
				sumaDivisores += i;
			}
		}
		return sumaDivisores==numero?true:false;
	}
}
