package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-abril-2018
 * @description Programa que calcula el primorial de un número de forma recursiva.       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/12/calcular-primorial-recursivo/
 */

public class PrimorialRecursivo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
         
        System.out.println("\nEl primorial de " + num + " es: " + primorial(num));
	}
	
	private static long primorial(int num){
		if(num==2){
			return 2;
		} else {
			if(esPrimo(num)){
				return num * primorial(num-1);
			} else {
				return primorial(num-1);
			}
		}		
	}
	
	private static boolean esPrimo(int num){
		for(int i=2; i<=num/2; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
	}
}
