package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 03-febrero-2017
 * @description Programa que presente por pantalla una pirámide de asteriscos invertida      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/02/03/piramide-invertida-de-asteriscos/
 */

public class PiramideAsteriscosInvertida {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
        System.out.println();
        for(int numBlancos=0, numAsteriscos=(numFilas*2)-1 ;numAsteriscos>0; numBlancos++, numAsteriscos-=2){
            //Espacios en blanco
            for(int i=0;i<numBlancos;i++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int j=numAsteriscos;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
