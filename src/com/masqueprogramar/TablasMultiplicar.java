package com.masqueprogramar;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 07-febrero-2017
 * @description Programa que muestre por pantalla las tablas de multiplicar del 1 al 10        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/02/07/tablas-multiplicar/ 
 */

public class TablasMultiplicar {
	
	public static void main(String[] args) {
		 
        for(int tabla = 1; tabla<=10; tabla++){
            System.out.println("\n Tabla del " + tabla);
            System.out.println("-------------");
 
            for(int i = 1;i<=10;i++){
                System.out.println(tabla + " x " + i + " = " + (tabla*i));
            }
        }
    }
}
