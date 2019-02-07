package com.masqueprogramar.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 05-febrero-2019
 * @description Programa que convierte un array de String en un ArrayList     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/02/05/convertir-array-a-arraylist/
 */

public class ConvertirArrayArrayList {

	public static void main(String[] args) {
		
		String[] array = {"uno", "dos", "tres", "cuatro", "cinco"};
		
		System.out.println("Método Arrays.asList");
		List<String> lista = Arrays.asList(array);
				
		try{
			lista.add("seis");	
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			System.out.println(lista);
		}

		
		System.out.println("\nConstructor ArrayList");
		List<String> arrayList = new ArrayList<String>(Arrays.asList(array));
		
		arrayList.add("seis");
		System.out.println(arrayList + "\n");
		
		
		System.out.println("lista: " + lista.getClass().getCanonicalName());
		System.out.println("arrayList: " + arrayList.getClass().getCanonicalName());

	}

}
