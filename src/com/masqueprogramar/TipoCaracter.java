package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 21-febrero-2017
 * @description Programa que pida un carácter al usuario y que indique como respuesta el tipo de carácter que es, es decir, si es una letra (A-Z, a-z), un número (0-9) o un carácter especial      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/02/21/tipo-de-caracter/ 
 */

public class TipoCaracter {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un caracter: ");
        char caracter = sc.next().charAt(0);
        sc.close();
        if (caracter >= '0' && caracter <= '9') {
             System.out.println("El caracter " + caracter + " es un número.");
        } else {
             if ((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')) {
                  System.out.println("El caracter " + caracter + " es una letra.");
             } else {
                  System.out.println("El caracter " + caracter + " es un caracter especial.");
             }
        }
 
        // Otra forma
        if (Character.isDigit(caracter)) {
            System.out.println("El caracter " + caracter + " es un número.");
        } else {
            if (Character.isLetter(caracter)) {
                System.out.println("El caracter " + caracter + " es una letra.");
            } else {
                System.out.println("El caracter " + caracter + " es un caracter especial.");
            }
        }
    }
}
