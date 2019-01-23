package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 27-enero-2019
 * @description Programa que presenta por pantalla una estrella de asteriscos     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/27/estrella-con-asteriscos/
 */

public class EstrellaAsteriscos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();
        teclado.close();
 
        System.out.println();	
        
        for(int i=1, k=numFilas; i<=numFilas; i++, k--){
        	for(int j=1; j<=numFilas; j++){
        		
        		if(i==j || k==j){
        			System.out.print("*");
        		} else {
        			System.out.print(" ");
        		}
        	}        	
        	System.out.println();
        }
	}
}
