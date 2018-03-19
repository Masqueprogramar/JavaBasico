package com.masqueprogramar.operadores;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 18-enero-2016
 * @description Ejemplo operadores relacionales      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/01/18/java-operadores-relacionales/
 */

public class OperadoresRelacionales {
	
	public static void main(String[] args){
		 
        int op1 = 1;
        int op2 = 2;
 
        System.out.println(op1 == op2);
        //Muestra por pantalla false (no son iguales)
 
        System.out.println(op1 != op2);
        //Muestra por pantalla true (son distintos)
 
        System.out.println(op1 > op2);
        //Muestra por pantalla false (op1 no es mayor que op2)
 
        System.out.println(op1 >= op2);
        //Muestra por pantalla false (op1 no es mayor o igual que op2)
 
        System.out.println(op1 < op2);
        //Muestra por pantalla true (op1 es menor que op2)
 
        System.out.println(op1 <= op2); 
        //Muestra por pantalla true (op1 es menor o igual que op2)
    }

}
