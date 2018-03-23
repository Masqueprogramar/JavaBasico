package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 23-marzo-2018
 * @description Programa que determina si dos números introducidos por teclado son "números amigos"
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/23/numeros-amigos-java/ 
 */

public class NumerosAmigos {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("Los números %d y %d ", num1, num2);
		if(sonAmigos(num1, num2)){
			System.out.println("son amigos.");
		} else {
			System.out.println("no son amigos.");
		}
	}
	
	private static boolean sonAmigos(int num1, int num2){
		boolean amigos;
		if(num1==sumaDivisores(num2)){
			amigos = num2==sumaDivisores(num1)?true:false;
		} else {
			amigos = false;
		}
		return amigos;
	}
	
	private static int sumaDivisores(int numero){
		int sumaDivisores = 0;
		for(int i=1;i<numero;i++){
			if(numero%i==0){
				sumaDivisores += i;
			}
		}
		return sumaDivisores;
	}
}
