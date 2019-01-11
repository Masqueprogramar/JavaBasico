package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-enero-2019
 * @description Programa que compruebe si un número natural introducido por teclado es un número Strong
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/11/numero-strong-en-java/ 
 */

public class NumeroStrong {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		sc.close();
		boolean strong = isStrongNumber(num);
		System.out.println("El número " + num +
                (strong?" sí":" no") + " es un Strong number.");		
	}
	
	private static boolean isStrongNumber(int num){
		int aux = num;
		int sumaFactorial = 0;
		int cifra = aux%10;
		do {
			sumaFactorial += factorial(cifra);
			aux /= 10;
			cifra = aux%10;
		} while (aux>0);
		return (sumaFactorial == num);
	}
	
	private static int factorial(int num){
		int rdo = 1;
		int aux = 2;
		while (aux<=num){
			rdo *= aux;
			aux++;
		}
		return rdo;
	}
}
