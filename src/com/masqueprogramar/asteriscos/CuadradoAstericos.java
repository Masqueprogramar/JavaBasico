package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 06-febrero-2017
 * @description Programa que presente por pantalla un cuadrado de asteriscos     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/02/06/cuadrado-de-asteriscos/
 */

public class CuadradoAstericos {
	
	public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = teclado.nextInt();
        teclado.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
