package com.masqueprogramar.geometria;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 30-diciembre-2016
 * @description Programa que dadas la base y la altura de un rectángulo nos devuelve su perímetro y área      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/12/30/perimetro-y-area-de-un-rectangulo/ 
 */

public class AreaPerimetroRectangulo {
	
	private static Scanner sc;

	public static void main(String[] args){
		 
        double perimetro, area;
        double base = leerNumeroReal("Introduce la base del rectangulo: ");
        double altura = leerNumeroReal("Introduce la altura del ractangulo: ");
        perimetro = 2 * (base+altura);
        area = base * altura;
 
        System.out.printf("%nEl perímetro del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, perimetro);
        System.out.printf("%nEl área del rectángulo de base %.2f y altura %.2f es %.2f.", base, altura, area);
    }
 
    private static double leerNumeroReal(String s){
        sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextDouble();
    }
}
