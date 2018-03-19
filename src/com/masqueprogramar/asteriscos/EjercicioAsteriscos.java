package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-enero-2017
 * @description Programa que presente por pantalla una escalera de asteriscos (derecha-izquierda)      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/11/ejemplo-asteriscos/
 */

public class EjercicioAsteriscos {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int numFilas = sc.nextInt();
 
        for(int i=1; i<=numFilas; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
 
        sc.close();
    }
}
