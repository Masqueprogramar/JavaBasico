package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 09-marzo-2018
 * @description Programa que muestra el número de cifras de un número entero positivo introducido por teclado realizado de forma recursiva.      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/09/numero-de-cifras-de-un-entero-recursivo/
 */

public class ContarCifrasRecursivo {
	
	public static void main(String[] args) {
        int num = leerNumeroEntero("Introduce un número entero positivo: ");
        System.out.printf("%nEl número de cifras del número %d es %d", num, cuentaCifras(num));
    }
     
    private static int cuentaCifras(int num){
        if(num<10)
            return 1;
        else{
            return 1 + cuentaCifras(num/10);
        }
    }
     
    private static int leerNumeroEntero(String texto){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do{
            System.out.print(texto);
            numero = sc.nextInt();
        }while(numero<=0);
        sc.close();
        return numero;
    }
}
