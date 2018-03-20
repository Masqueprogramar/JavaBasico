package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 22-febrero-2017
 * @description Programa que pida un número entero y que indique como respuesta si es positivo, negativo o el cero.      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/02/22/signo-numero/ 
 */

public class SignoNumero {
	
	public static void main(String[] args) {
        int num = leerEntero("Introduce un número entero: ");
         
        if(num<0) 
            System.out.printf("El número %d es negativo.", num); 
        else if(num>0)
            System.out.printf("El número %d es positivo.", num);
        else
            System.out.println("El número es el 0.");
    }
     
    private static int leerEntero(String s){
        int entero;
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        entero = sc.nextInt();
        sc.close();
        return entero;
    }
}
