package com.masqueprogramar.operadores;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 13-enero-2016
 * @description Ejemplo operadores unarios      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/01/13/java-operadores-unarios/
 */

public class OperadoresUnarios {
	
	public static void main(String[] args){
        int resultado = +1;
        System.out.println(resultado); //resultado es 1
 
        resultado--; //resultado es 0
        System.out.println(resultado);
 
        resultado++; //resultado es 1
        System.out.println(resultado);
 
        resultado = -resultado; // resultado es -1
        System.out.println(resultado);
 
        boolean enc = false;
        System.out.println(enc); //muestra false
        System.out.println(!enc); //muestra true
        
        
        int i = 3;
        System.out.println(i++); //3
        System.out.println(i);   //4
 
        i = 3;
        System.out.println(++i);  //4
        System.out.println(i);    //4
    }
}
