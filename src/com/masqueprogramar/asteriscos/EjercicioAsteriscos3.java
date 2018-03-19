package com.masqueprogramar.asteriscos;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 09-marzo-2018
 * @description Programa que presente por pantalla una figura de asteriscos      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/09/ejemplo-asteriscos-iii/
 */

public class EjercicioAsteriscos3 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int numFilas = sc.nextInt();
         
        for(int i = 0, j=numFilas; i<=numFilas; i++, j--){
            escribirCaracter(' ', i);
            escribirCaracter('*', j);
            System.out.println();
        }
        sc.close();
    }
     
    private static void escribirCaracter(char c, int cont){
        for(int i = 0; i<cont; i++){
            System.out.print(c);
        }
    }
}
