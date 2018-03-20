package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 03-enero-2017
 * @description Programa que dada una distancia en kilómetros (un valor entero) devuelve su equivalencia en millas marinas, sabiendo que 1 milla marina equivale a 1,8532 km      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/03/kilometros-a-millas-marinas/ 
 */

public class KilometrosMillas {
	
	public static void main(String[] args){
		 
        int km;
        double resultado;
        final double MILLA = 1.8532;        //Constante en mayuscula
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Introducir la distancia en kilómetros: ");
        km = sc.nextInt();
        sc.close();
 
        resultado = km / MILLA;
        resultado = Math.rint(resultado*100)/100;
 
        System.out.println("\nDistancia equivalente en millas marinas: " + resultado);
    }
}
