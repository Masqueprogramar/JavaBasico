package com.masqueprogramar.arrays.matrices;

import java.util.Random;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 24-abril-2018
 * @description Programa que crea una matriz de 5 x 5, la inicialice con números aleatorios del 1 al 25 y posteriormente la visualice por pantalla       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/24/matriz-aleatorios-java/ 
 */

public class MatrizNumerosAleatorios {
	
	public static void main(String[] args) {
		int[][] matrizNumeros = new int[5][5];
		inicializar(matrizNumeros);
		visualizar(matrizNumeros);
	}

	static void inicializar(int[][] matriz){
		 Random r = new Random();
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j] = r.nextInt(25) + 1; 
			}
		}
	}
	
	static void visualizar(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
