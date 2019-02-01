package com.masqueprogramar.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 31-enero-2019
 * @description Programa que elimina elementos duplicados en un ArrayList     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/31/eliminar-repetidos-arraylist
 */

public class EliminarRepetidosArrayList {

	public static void main(String[] args) {
		
		List<String> colores;
		colores = new ArrayList<String>();
		
		colores.add("verde");
		colores.add("rojo");
		colores.add("rojo");
		colores.add("amarillo");
		colores.add("azul");
		colores.add("azul");
		colores.add("azul");
		colores.add("blanco");
		
		System.out.printf("Colores%n");
		for (String s : colores) {
			System.out.println(s);
		}
		
		Set<String> hashSet = new HashSet<String>(colores);
		colores.clear();
		colores.addAll(hashSet);

		System.out.printf("%n%nColores sin repetición%n");
		for (String s : colores) {
			System.out.println(s);
		}

	}
	
}
