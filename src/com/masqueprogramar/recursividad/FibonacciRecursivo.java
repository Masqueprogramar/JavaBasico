package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 18-enero-2017
 * @description Programa que muestra los N primeros números de la sucesión de Fibonacci de forma recursiva.     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/18/fibonacci-recursivo/
 */

public class FibonacciRecursivo {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();

        for(int i = 0; i<limite; i++){
             System.out.print(funcionFibonacci(i) + ", ");
        }
   }

   private static int funcionFibonacci(int num){
        if(num == 0 || num==1)
             return num;
        else
             return funcionFibonacci(num-1) + funcionFibonacci(num-2);
   }
}
