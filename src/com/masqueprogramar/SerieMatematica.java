package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 05-enero-2017
 * @description Programa que permite evaluar la serie Sumatorio de 0 a n de 1/(x+y^i)        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/05/serie-matematica/
 */

public class SerieMatematica {
	
	public static void main(String[] args) {
        int x, y, n;
        x = leerNumeroEntero("Introducir el valor de x: ");
        y = leerNumeroEntero("Introducir el valor de y: ");
        n = leerNumeroEntero("Introducir el número de repeticiones (n): ");
 
        System.out.printf("%nEl valor de la serie es %.4f.", calcularSerie(x, y, n));
    }
 
    private static double calcularSerie(int x, int y, int n){
        double rdo = 0.0;
        for(int i = 1; i<=n; i++){
            rdo += 1.0 / (x + Math.pow(y, i));
        }
        return rdo;
    }
 
    private static int leerNumeroEntero(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextInt();
    }
}
