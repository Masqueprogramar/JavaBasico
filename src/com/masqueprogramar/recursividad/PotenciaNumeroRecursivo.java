package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 05-abril-2018
 * @description Programa que calcula el resultado de una potencia, la base y el exponente introducidos por teclado, de forma recursiva.      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/05/potencia-numero-recursivo/
 */

public class PotenciaNumeroRecursivo {
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = teclado.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = teclado.nextInt();
        teclado.close();
        System.out.printf("%n%d elevado a %d es igual a %.3f", base, exponente, potencia(base, exponente));
    }
     
    private static double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(base, exponente+1) / base;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
}
