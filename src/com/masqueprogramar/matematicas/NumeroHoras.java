package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 08-febrero-2017
 * @description Programa que introducido un número de horas las transforma a semanas, días y horas correspondientes        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/02/08/numero-total-de-horas/ 
 */

public class NumeroHoras {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número total de horas: ");
        int totales = teclado.nextInt();
        int numS, numD, numH;
        teclado.close();
 
        System.out.printf("%nNúmero total de horas: %d.%n", totales);
 
        numS = totales / (7*24);
        totales %= 7*24;
        numD = totales / 24;
        totales %= 24;
        numH = totales;
 
        System.out.printf("Equivale a %d semanas, %d días y %d horas.", numS, numD, numH);
    }
}
