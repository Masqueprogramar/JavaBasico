package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-mayo-2018
 * @description Programa que determine si un número introducido por teclado es un número duck
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/10/numero-duck-java/
 */

public class NumeroDuck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		String numero = sc.next();
		sc.close();
		boolean numeroDuck;
		
		//1º forma, métodos de la clase String
		if(numero.contains("0") && numero.charAt(0)!='0'){
			numeroDuck = true;
		} else {
			numeroDuck = false;
		}
		System.out.printf("%n¿El número %s es un número duck? %s", 
				numero, numeroDuck?"Sí":"No");
				
		//2º forma, iterando el número
		numeroDuck = numero.charAt(0)!='0';
		if(numeroDuck){
			for(int i=0;i<numero.length();i++){
				if(numero.charAt(i)=='0'){
					numeroDuck = true;
					break;
				}
			}
		}
		System.out.printf("%n%n¿El número %s es un número duck? %s", 
				numero, numeroDuck?"Sí":"No");
	}
}
