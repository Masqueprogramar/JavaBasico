package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 17-abril-2018
 * @description Programa que muestra los n (introducido por teclado) primeros números Harshad    
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/17/mostrar-numeros-harshad-en-java/
 */

public class NumerosHarshad {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el límite: ");
		int limite = sc.nextInt(); 
		sc.close();
		
		System.out.println("\nNúmeros Harshad del 1 al " + limite);
		for(int i=1;i<=limite;i++){
			if(isNumHarshad(i)){
				System.out.print(i + " ");
			}
		}
	}
	
	private static boolean isNumHarshad(int num){
		int sumaDigitos = 0;
		int aux = num;
		while(aux!=0){
			sumaDigitos += aux%10;
			aux = aux/10;
		}
		return num%sumaDigitos==0;
	}
}
