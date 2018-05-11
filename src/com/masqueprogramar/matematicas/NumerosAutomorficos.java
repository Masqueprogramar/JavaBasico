package com.masqueprogramar.matematicas;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 16-abril-2018
 * @description Programa que muestra los números automorficos de 1 hasta un número introducido por teclado        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/16/mostrar-numeros-automorficos/
 */

public class NumerosAutomorficos {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.print("Introduce un número natural: ");
		int limite = sc.nextInt();
		sc.close();
		System.out.println("\nNúmeros automórficos del 1 al " + limite);
		System.out.println("*********************************");
		for(int i=1;i<=limite;i++){
			comprobarNumAutomorfico(i);
		}
	}
	
	private static void comprobarNumAutomorfico(int numero){
		int cuadrado = (int)Math.pow(numero, 2);
		int numDigitos = numeroDigitos(numero);
		int restoDigitos = (int) (cuadrado % Math.pow(10, numDigitos)); 
		if(numero == restoDigitos){
			System.out.println("\t" + numero);
		}
	}
	
	private static int numeroDigitos(int num){
		return Integer.toString(num).length();
	}
	
	@SuppressWarnings("unused")
	private static int numeroDigitos2(int num){
		return (int)(Math.log10(num)+1);
	}
	
	@SuppressWarnings("unused")
	private static int numeroDigitos3(int num){
		int numDigitos = 0;
		while (num!=0) {
			num /= 10;
			numDigitos++;
		}
		return numDigitos;
	}
}
