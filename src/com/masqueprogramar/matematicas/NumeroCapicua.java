package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 23-marzo-2018
 * @description Programa que compruebe si un número natural es capicua          
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/23/numero-capicua-java/ 
 */

public class NumeroCapicua {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		sc.close();
		boolean capicua = esCapicua(num);
		System.out.println("\nEl número " + num + (capicua?" sí":" no") + " es capicua.");
	}

	private static boolean esCapicua(int num) {
		return num==invertirNumero(num);
	}
	
	private static int invertirNumero(int num){
		int cifra, inverso = 0;
		while(num>0){
			cifra = num%10;
			inverso = cifra + inverso * 10; 
			num /= 10;
		}
		return inverso;
	}
}
