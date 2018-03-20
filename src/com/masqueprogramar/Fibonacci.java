package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 29-diciembre-2016
 * @description Programa que muestra los N primeros números de la sucesión de Fibonacci      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/12/29/fibonacci-iterativo/
 */

public class Fibonacci {
	
	public static void main(String[] args) {		 
        int n1 = 0;
        int n2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();  
        sc.close();
 
        System.out.print(n1 + ", ");
        System.out.print(n2 + ", ");
 
        for(int i = 0; i<limite-2; i++){
            n2 = n1 + n2;
            n1 = n2 - n1;
            System.out.print(n2 + ", ");
        }
    }
}
