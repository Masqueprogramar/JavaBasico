package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 21-marzo-2018
 * @description Programa que pide al usuario un número por teclado y muestra el número invertido        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/21/numero-invertido 
 */

public class InvertirNumero {

	private static Scanner sc;

	public static void main(String[] args) {
		int num;
		sc = new Scanner(System.in);
		System.out.print("Introduce un número para invertir: ");
		num = sc.nextInt();
		sc.close();
		System.out.printf("%nEl número %d invertido es el %d", num, invertirNumero(num) );
	}
	
	private static int invertirNumero(int numero){
		int cifra, inverso = 0;
		while(numero!=0){
			cifra = numero%10;
			inverso = (inverso * 10) + cifra;
			numero/=10;
		}
		return inverso;
	}
}
