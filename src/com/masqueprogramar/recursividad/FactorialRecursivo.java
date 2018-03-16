package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 08-marzo-2018
 * @description Programa que realiza el factorial de un número introducido por teclado de forma recursiva.     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/08/factorial-recursivo-en-java/
 */

public class FactorialRecursivo {
	
	public static void main(String[] args) {
	     
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
         
        System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    }
     
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
}
