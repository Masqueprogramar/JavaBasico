package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-marzo-2018
 * @description Programa que calcula la suma de los dígitos de un número de forma recursiva.        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/12/sumar-digitos-recursivo/
 */

public class SumarDigitosRecursivo {
	
	static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int numero = entrada.nextInt();
        System.out.printf("%nLa suma de los dígitos del número %d es %d", numero, sumaDigitos(numero));;
    }
     
    private static int sumaDigitos(int num){
        if(num==0){
            return 0;
        } else {
            return sumaDigitos(num/10) + num%10;
        }
    }

}
