package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 04-mayo-2018
 * @description Programa que dado un número en decimal muestre el correspondiente en hexadecimal      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/04/decimal-hexadecimal-java/ 
 */

public class DecimalAHexadecimal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número decimal: ");
		int decimal = teclado.nextInt();
		teclado.close();
		
		// 1º método con toHexString 
		String hexadecimal = Integer.toHexString(decimal);
		System.out.printf("%nMétodo 1 -> Decimal: %d, Hexadecimal: %s", decimal, hexadecimal);
		
		// 2º método con array
		char digitosH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String hexadecimal2 = "";
		int resto, aux = decimal;
		
		while(aux>0){
			resto = aux % 16;
			hexadecimal2 = digitosH[resto] + hexadecimal2;
			aux /= 16; 
		}
		System.out.printf("%n%nMétodo 2 -> Decimal: %d, Hexadecimal: %s", decimal, hexadecimal2);
	}
}
