package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-abril-2018
 * @description Programa que muestra los n (introducido por teclado) primeros números Carol    
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/12/mostrar-numeros-carol/
 */

public class NumerosCarol {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce número de elementos: ");
		int limite = sc.nextInt(); 
		sc.close();
		
		System.out.println("\n" + limite + " primeros números Carol");
		System.out.println("*************************\n");
		for (int i = 1; i <= limite; i++) {
			System.out.println("\t" + numCarol(i));
		}
	}
	
	private static long numCarol(int num){
		double tmp = Math.pow(4, num) - Math.pow(2, num + 1) - 1;
		return (int)tmp;
	}
}
