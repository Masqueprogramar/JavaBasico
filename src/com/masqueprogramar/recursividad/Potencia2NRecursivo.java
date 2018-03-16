package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 09-marzo-2018
 * @description Programa que calcula el resultado de una potencia de base 2 elevado a un exponente introducido por teclado, de forma recursiva.      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/09/potencia-base-2-recursivo/
 */

public class Potencia2NRecursivo {
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor n: ");
        int n = teclado.nextInt();
        teclado.close();
        System.out.printf("%n2 elevado a %d es igual a %d", n, potencia2(n));
    }
     
    private static int potencia2(int n){
        if(n == 0)
            return 1;
        else
            return 2 * potencia2(n-1);
    }
}
