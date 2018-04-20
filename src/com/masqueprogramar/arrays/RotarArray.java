package com.masqueprogramar.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 19-abril-2018
 * @description Programa que pida al usuario la dimensión del array (se genere de forma aleatoria), 
 * el número de posiciones a rotar y el sentido, y lo rote y muestre según los datos introducidos   
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/04/19/rotar-array-java/ 
 */

public class RotarArray {
	
	static Scanner sc = new Scanner(System.in);
	static int[] numeros;
	
	void rotarIzda(int pos){
		for(int i=1;i<=pos;i++){
			rotarIzda1Pos();
		}
	}
	
	void rotarIzda1Pos(){
		int temp = numeros[0];
		for(int i=0;i<numeros.length;i++){
			numeros[i] = numeros[i+1];
		}
		numeros[numeros.length-1] = temp;
	}
	
	void rotarDcha(int pos){
		for(int i=1;i<=pos;i++){
			rotarDcha1Pos();
		}
	}
	
	void rotarDcha1Pos(){
		int temp = numeros[numeros.length-1];
		for(int i=numeros.length-1; i>0; i--){
			numeros[i] = numeros[i-1];
		}
		numeros[0] = temp;
	}
	
	
	void visualizarArray(){
		System.out.println(Arrays.toString(numeros) + "\n");
	}
	
	void llenarArray(){
		for(int i=0;i<numeros.length;i++){
			numeros[i] = (int) (Math.random () * 100);
		}
	}
	
	void inicializarArray(){
		int dimension = 0;
		while (dimension<1) {
			System.out.print("Dimensión del array: ");
			dimension = sc.nextInt();
			if(dimension<1){
				System.out.println("Dimensión no válida. Debe ser mayor de 0.\n");
			}
		}
		numeros = new int[dimension];
	}
	
	static int pedirNumRotaciones(){
		int numRotaciones = 0;
		while (numRotaciones<1) {
			System.out.print("Cantidad de rotaciones: ");
			numRotaciones = sc.nextInt();
			if(numRotaciones<1){
				System.out.println("Cantidad no válida. Debe ser mayor de 0.\n");
			}
		}
		return numRotaciones;
	}
	
	static int pedirSentido(){
		int sentido = 0;
		do {
			System.out.print("Introduce el sentido de la rotacion 1-izquierda / 2-derecha: ");
			sentido = sc.nextInt();
			if(!(sentido==1 || sentido==2)){
				System.out.println("Opción no valida\n");
			}
		} while (!(sentido==1 || sentido==2));
		
		return sentido;
	}
	
	
	public static void main(String[] args) {
		
		RotarArray rotar = new RotarArray();
		
		rotar.inicializarArray();
		rotar.llenarArray();
		rotar.visualizarArray();
		
		int numRotaciones = pedirNumRotaciones();
		int opcion = pedirSentido();
		if(opcion==1){
			rotar.rotarIzda(numRotaciones);
		} else{
			rotar.rotarDcha(numRotaciones);
		}
		
		rotar.visualizarArray();
	}
}
