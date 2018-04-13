package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-abril-2018
 * @description Programa que muestra los números Emirp de 1 hasta un número introducido por teclado        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/12/calcular-numeros-emirp/
 */

public class NumerosEmirp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el límite: ");
		int num = sc.nextInt(); 
		sc.close();
		
		System.out.println("\nNúmeros emirp del 1 al " + num);
		System.out.println("**************************\n");
		for (int aux = 1; aux <= num; aux++) {
			if(aux != invertirNumero(aux) && esPrimo(aux) 
					&& esPrimo(invertirNumero(aux))){
				System.out.println("\t" + aux);
			}
		}
	}
	
	private static int invertirNumero(int numero){
		int cifra, inverso = 0;
		while(numero!=0){
			cifra = numero%10;
			inverso = (inverso * 10) + cifra;
			numero/=10;
		}
		return inverso;
	}	
	
	private static boolean esPrimo(int num){
		for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
	}
}
