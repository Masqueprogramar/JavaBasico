package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-enero-2019
 * @description Programa que compruebe si un número natural introducido por teclado es un número misterioso  
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/10/numero-misterioso-en-java/ 
 */

public class NumeroMisterioso {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt();
		teclado.close();
		boolean misterio = esMisterioso(num);
		System.out.println("El número " + num + 
				(misterio?" sí":" no") + " es misterioso.");
	}
		
	private static int invertirNumero(int num){
		int cifra, inverso = 0;
		while (num > 0) {
			cifra = num%10;
			inverso = cifra + inverso * 10;
			num /= 10;
		}
		return inverso;
	}
	
	private static boolean esMisterioso(int num) {
		for(int i=1; i <= num/2; i++){
			int aux = invertirNumero(i);
			if(i + aux == num){
				System.out.println(i + " " + aux);
				return true;
			}
		}		
		return false;
	}
		
}
