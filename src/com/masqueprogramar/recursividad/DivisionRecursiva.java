package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 12-marzo-2018
 * @description Programa que realice la división entre dos números mediante restas sucesivas. Algoritmo recursivo.      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/12/division-recursiva/
 */

public class DivisionRecursiva {

	static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int dividendo, divisor;
        System.out.print("Introduce el dividendo: ");
        dividendo = entrada.nextInt();
        System.out.print("Introduce el divisor: ");
        divisor = entrada.nextInt();
        System.out.printf("%nLa división entre los dos números es: %d", divisionRecursiva(dividendo, divisor));
    }
     
    private static int divisionRecursiva(int dividendo, int divisor){
        if(divisor>dividendo){
            return 0;
        } else {
            return 1 + divisionRecursiva(dividendo-divisor, divisor);
        }
    }
}
