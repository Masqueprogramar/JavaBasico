package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-enero-2017
 * @description Programa que presente por pantalla una figura de asteriscos      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/12/ejemplo-asteriscos-ii/
 */

public class EjercicioAsteriscos2 {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int numFilas = sc.nextInt();
 
        for(int i = 1; i<=numFilas; i++){
            for(int j = 0; j<=numFilas-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
