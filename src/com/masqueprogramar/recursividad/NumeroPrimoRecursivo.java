package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 13-marzo-2018
 * @description Programa que determina si un número es primo o no de forma recursiva.       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/13/numero-primo-recursivo/
 */

public class NumeroPrimoRecursivo {
	
	private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.printf("%nEl numero %d ", numero);
        System.out.print(numeroPrimo(numero, 2)?"es un número primo.":"no es un número primo.");
    }
     
    private static boolean numeroPrimo(int num, int divisor){
        if(num/2 < divisor){
            return true;
        } else {
            if(num%divisor==0){
                return false;
            } else {
                return numeroPrimo(num, divisor+1);
            }
        }
    }

}
