package com.masqueprogramar.operadores;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 19-enero-2017
 * @description Ejemplo operadores condicionales      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/19/java-operadores-condicionales/
 */

public class OperadoresCondicionales {
	
	public static void main(String[] args) {
		 
        int valor1 = 7;
        int valor2 = 3;
 
        System.out.println("Ejemplos operador &&");
        System.out.print("¿El valor1 Y el valor2 son menores que 10? ");
        if(valor1<10 && valor2<10){
            System.out.println("Sí. Se cumplen las dos condiciones.");
        }
        else{
            System.out.println("No. No se cumplen alguna de las condiciones.");
        }
 
        System.out.print("¿El valor1 Y el valor2 son menores que 5? ");
        if(valor1<5 && valor2<5){
            System.out.println("Sí. Se cumplen las dos condiciones.");
        }
        else{
            System.out.println("No. No se cumplen alguna de las condiciones.");
        }
 
        System.out.println("\nEjemplos operador ||");
        System.out.print("¿El valor1 O el valor2 son menores que 5? ");
        if(valor1<5 || valor2<5){
            System.out.println("Sí. Se cumplen alguna de las dos condiciones.");
        }
        else{
            System.out.println("No. No se cumple ninguna de las dos condiciones.");
        }
 
        System.out.print("¿El valor1 O el valor2 son menores que 2? ");
        if(valor1<5 && valor2<5){
            System.out.println("Sí. Se cumplen alguna de las dos condiciones.");
        }
        else{
            System.out.println("No. No se cumple ninguna de las dos condiciones.");
        }
    }
}
