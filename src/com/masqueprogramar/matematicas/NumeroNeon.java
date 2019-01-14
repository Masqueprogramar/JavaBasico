package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-enero-2019
 * @description Programa que compruebe si un número es un número Neon          
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/14/numero-neon-java/ 
 */

public class NumeroNeon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = in.nextInt();
		in.close();
				
		System.out.printf("%n¿El número %d es un número Neon? %s",
				num, isNeonNumber(num)?"Sí":"No");

	}

	private static boolean isNeonNumber(int num) {
		int cuadrado = (int)(Math.pow(num, 2));
		System.out.println(num + " * " + num + " = " + cuadrado);
		int sumaDigitos = 0;
		while(cuadrado>0){
			sumaDigitos += cuadrado%10;
			cuadrado /= 10;
		}
		System.out.println("Sumadigitos: " + sumaDigitos);
		return num==sumaDigitos;
	}

}
