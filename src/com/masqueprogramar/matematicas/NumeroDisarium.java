package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 25-mayo-2018
 * @description Programa que compruebe si un número es un número disarium          
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/25/numero-disarium-java/ 
 */

public class NumeroDisarium {
	
	public static void main(String[] args) {
		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = in.nextInt();
		in.close();
				
		System.out.printf("%n¿El número %d es un número disarium? %s",
				num, esDisarium(num)?"Sí":"No");
	}
	
	private static boolean esDisarium(int num){
		
		//Número de digitos
		int numDigitos = String.valueOf(num).length();
		
		int digito, total = 0;
		int aux = num;
		while(aux!=0){
			//Recuperar cada digito (por la derecha) 
			digito = aux % 10;
			
			//Suma de los digitos a la potencia de su posicion
			total += (int)Math.pow(digito, numDigitos);
			aux /= 10;
			numDigitos--;
		}
		return total==num;
	}
}
