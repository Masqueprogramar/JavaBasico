package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-marzo-2018
 * @description Programa que calcule los números primos comprendidos entre dos números      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/14/numeros-primos/
 */

public class NumerosPrimos {
	
	public static void main(String[] args) {
        
        int n1 = leerNumero("Introduce el límite inferior (n1): ");
        int n2 = leerNumero("Introduce el límite superior (n2): ");
        while (n1>n2) {
            System.out.println("El limite superior debe ser mayor que el limite inferior");
            n2 = leerNumero("Introduce el límite superior (n2): ");
        }
        System.out.printf("%nLos números primos entre %d y %d son:%n", n1, n2);
        int cont = 0;
        for(int i=n1;i<=n2;i++){
            if(esPrimo(i)){
                System.out.print(i + " ");
                cont++;
            }
            if(cont==4){
                System.out.println();
                cont=0;
            }
        }
    }
     
    private static boolean esPrimo(int num){
        boolean primo = true;
        int i = 2;
        while(primo && i<num/2){
            if(num%i==0){
                primo = false;
            }
            i++;
        }
        return primo;
    }
     
    private static int leerNumero(String texto){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print(texto);
        num = sc.nextInt();
        return num;
    }
}
