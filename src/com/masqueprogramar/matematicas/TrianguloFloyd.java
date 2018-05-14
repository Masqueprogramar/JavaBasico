package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 04-mayo-2018
 * @description Programa que muestre el triángulo de Floyd pidiendo al usuario el número de filas
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/04/triangulo-floyd-java/ 
 */

public class TrianguloFloyd {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		int filas, num = 1;
		System.out.print("Introduce el número de líneas del triángulo de Floyd: ");
		sc = new Scanner(System.in);
		filas = sc.nextInt();
		for(int i=1; i<=filas; i++){
			for(int j=1; j<=i; j++){
				System.out.print("\t" + num);
				num++;
			}
			System.out.println();
		}
	}
}
