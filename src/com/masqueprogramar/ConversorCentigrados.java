package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 03-enero-2017
 * @description Programa que dada una temperatura en grados Centígrados (valor entero) devuelva la temperatura equivalente en grados Fahrenheit y en grados Kelvin      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/03/conversor-centigrados/ 
 */

public class ConversorCentigrados {
	
	public static void main(String[] args){
		 
        int centigrados;
        double fah, kel;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Introduce la temperatura en grados centígrados: ");
        centigrados = sc.nextInt();
 
        //Calcular fahrenheit
        fah = (centigrados / 0.5556) + 32;
        fah = Math.round(fah*Math.pow(10,2))/Math.pow(10,2);    //Redondear
        //fah = Math.rint(fah*100)/100;             Otra forma redondear
 
        //Calcular Kelvin
        kel = centigrados + 273.16;
 
        System.out.println("\nLa temperatura en grados Fahrenheit es " + fah);
        System.out.println("La temperatura en grados Kelvin es " + kel);
    }
}
