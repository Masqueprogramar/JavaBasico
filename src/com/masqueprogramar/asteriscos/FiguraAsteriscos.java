package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 21-enero-2019
 * @description Programa que presenta por pantalla una figura de asteriscos     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/21/figura-asteriscos-en-java/
 */

public class FiguraAsteriscos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();
        int numBlancos = (numFilas * 2) - 2;
        teclado.close();
 
        System.out.println();		
		
        for(int i=1; i<=numFilas ; i++){
        	
        	// Asteriscos
        	for(int j=1;j<=i;j++){
        		System.out.print("*");
        	}
        	
        	// Blancos
        	for(int j=1;j<=numBlancos; j++){
        		System.out.print(" ");
        	}
        	
        	// Asteriscos
        	for(int j=1;j<=i;j++){
        		System.out.print("*");
        	}
        	
        	numBlancos -= 2;
        	System.out.println();
        }
    }
}
