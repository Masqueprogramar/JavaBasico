package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 31-marzo-2017
 * @description Programa que dado el número del DNI, muestra la letra que le corresponde       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/03/31/calcular-letra-dni/ 
 */

public class LetraDNI {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu número de DNI: ");
        int numDNI = sc.nextInt();
        System.out.printf("La letra que corresponde a %d es %c", numDNI, calcularLetra(numDNI));
        sc.close();
   }

   private static char calcularLetra(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
   }

   @SuppressWarnings("unused")
   private static char calcularLetraArray(int dni){
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = dni%23;
        return caracteres[resto];
   }
}
