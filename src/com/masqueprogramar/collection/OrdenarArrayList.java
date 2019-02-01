package com.masqueprogramar.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 01-febrero-2019
 * @description Programa que ordena los elementos en un ArrayList     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/02/01/ordenar-elementos-arraylist
 */


public class OrdenarArrayList {

	public static void main(String[] args) {
		
		List<String> colores = new ArrayList<String>();
		
		colores.add("verde");
		colores.add("rojo");
		colores.add("gris");
		colores.add("amarillo");
		colores.add("purpura");
		colores.add("negro");
		colores.add("azul");
		colores.add("naranja");
		colores.add("rosa");
		colores.add("blanco");
				
		System.out.println("Colores");
		System.out.println(colores);
				
		Collections.sort(colores);
		System.out.println("\nColores ordenados");
		System.out.println(colores);
		
		Collections.sort(colores, Collections.reverseOrder());
		
		/* Otra forma en dos pasos
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(colores, comparador);*/
		
		System.out.println("\nColores ordenados inverso");
		System.out.println(colores);

	}

}
