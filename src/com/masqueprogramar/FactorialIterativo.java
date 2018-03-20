package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-marzo-2018
 * @description Programa que pide al usuario una serie de números naturales y dé como resultado el factorial de cada uno de ellos      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/14/factorial-iterativo/
 */

public class FactorialIterativo {
	
	public static void main(String[] args) {
        int numero = leerNumero();
        while (numero>-1) {
            mostrarFactorial(numero);
            numero = leerNumero();
        }   
        System.out.println("\nFin del programa");
    }
 
    private static void mostrarFactorial(int num){
        System.out.printf("%n%d! = ", num);
        int fact = 1;
        if(num!=0){
            for(int i = num;i>0;i--){
                fact *= i;
                System.out.print(i);
                if(i>1){
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }
            }
        }
        System.out.println(fact + "\n");
    }
     
    private static int leerNumero(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (negativo para terminar): ");
        num = sc.nextInt();
        return num;
    }
}
