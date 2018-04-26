package com.masqueprogramar.arrays.matrices;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 25-abril-2018
 * @description Programa que pida por teclado las dimensiones de una matriz cuadrada, 
 * inserte en cada posición de la matriz el resultado de multiplicar la fila y la columna de esa posición y visualizarla por pantalla.       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/25/matriz-producto-fila-columna-java/ 
 */

public class MatrizMultiplicarRowCol {
	
	public static void main(String[] args) {
		int[][] matriz;
		int dim = leerDimension();
		matriz = new int[dim][dim];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1)*(j+1);
			}
		}
		visualizar(matriz);
	}
	
	static int leerDimension(){
		Scanner entrada = new Scanner(System.in);
		int dim = 0;
		do {
			System.out.print("Introduce la dimensión de la matriz: ");
			dim = entrada.nextInt();
			if(dim<=0){
				System.out.println("La dimensión de la matriz debe ser mayor que 0.\n");
			}
		} while (dim<=0);
		entrada.close();
		return dim;
	}
	
	static void visualizar(int[][] pMatriz){
		for(int i=0;i<pMatriz.length;i++){
			for(int j=0;j<pMatriz[i].length;j++){
				System.out.print("\t" + pMatriz[i][j]);
			}
			System.out.println();
		}
	}
}
