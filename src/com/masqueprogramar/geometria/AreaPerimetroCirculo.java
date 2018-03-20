package com.masqueprogramar.geometria;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 31-diciembre-2016
 * @description Programa que dado el radio de un círculo calcule su perímetro y su área      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/12/31/perimetro-y-area-de-un-circulo/ 
 */

public class AreaPerimetroCirculo {
	
	private static Scanner sc;

	public static void main(String[] args){
		 
        double radio = leerNumero("Introduce el radio del circulo: ");
        double area, perimetro;
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("\nEl perímetro del circulo de radio %.2f es %.2f.", radio, perimetro);
        System.out.printf("\nEl área del circulo de radio %.2f es %.2f.", radio, area);
    }
 
    private static double leerNumero(String s){
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();
    }
}
