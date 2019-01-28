package com.masqueprogramar.recursividad;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 24-enero-2019
 * @description Programa que introducido un número muestre su tabla de multiplicar de forma recursiva     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/24/tabla-multiplicar-recursivo/
 */

public class TablaMultiplicarRecursivo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce la tabla que quieres mostrar: ");
		int tabla = teclado.nextInt();
		System.out.print("Introduce el número de multiplicadores: ");
		int numVeces = teclado.nextInt();
		teclado.close();
		System.out.println("\n\tTabla del " + tabla);
		System.out.println("****************************\n");
		multiplicar(tabla, numVeces);
	}
	
	public static void multiplicar(int tabla, int numVeces){
		if(numVeces>1){
			multiplicar(tabla, numVeces-1);
		}
		System.out.println("\t" + tabla + " x " + numVeces + " = " + (tabla * numVeces) );
	}

}
