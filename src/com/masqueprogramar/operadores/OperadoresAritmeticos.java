package com.masqueprogramar.operadores;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 11-enero-2016
 * @description Ejemplo operadores aritmeticos  
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/01/11/java-operador-de-asignacion-simple-y-operadores-aritmeticos/
 */

public class OperadoresAritmeticos {
	
	public static void main (String[] args){
		 
	    int rdo = 15 + 6;
	    System.out.println(rdo);//Muestra por consola 21
	 
	    rdo = 21 - 7;
	    System.out.println(rdo);//Muestra por consola 14
	 
	    rdo = rdo * 2;
	    System.out.println(rdo);//Muestra por consola 28
	 
	    System.out.println(rdo / 7);//Muestra por consola 4
	 
	    rdo = rdo % 5;
	    System.out.println(rdo);//Muestra por consola 3
	 
	    String a = "Hola ";
	    String b = "Mundo";
	    System.out.println(a + b + "!!!"); 
	    //Muestra por consola la cadena "Hola Mundo!!!"
	}
}
