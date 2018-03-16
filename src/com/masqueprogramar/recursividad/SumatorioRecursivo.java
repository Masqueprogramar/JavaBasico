package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 08-marzo-2018
 * @description Programa que realiza el sumatorio de los N primeros números de forma recursiva.     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/08/sumatorio-recursivo-en-java/
 */

public class SumatorioRecursivo {
	
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();
        teclado.close();
        int total = sumatorio(num);
 
        System.out.printf("%nEl sumatorio de 1 a %d es %d", num, total);
 
    }
 
    private static int sumatorio(int num){
        if(num==1){
            return 1;
        }
        else{
            return num + sumatorio(num-1);
        }
    }
}
