package com.masqueprogramar.operadores;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 19-enero-2017
 * @description Ejemplo operadores condicionales cortocircuitados     
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/19/java-operadores-condicionales/
 */

public class OperadoresCondicionalesCortocircuito {
	
	public static void main(String[] args) {
		 
        int valor1 = 7;
        int valor2 = 3;
 
        System.out.println("Ejemplo del comportamiento 'cortocircuito' (Evalúa la 2ª expresión cuando es necesario)");
        if(esMenorQue5(valor1) && esMenorQue5(valor2)){
            System.out.println("Los valores son menores que 5");
        }
        else{
            System.out.println("Los dos valores no son menores que 5");
        }
 
        System.out.println("\nEjemplo del comportamiento NO 'cortocircuito' (Evalúa siempre las dos expresiones)");
        if(esMenorQue5(valor1) & esMenorQue5(valor2)){
            System.out.println("Los valores son menores que 5");
        }
        else{
            System.out.println("Los dos valores no son menores que 5");
        }
    }
 
    private static boolean esMenorQue5(int num){
        System.out.println("Evaluando el número " + num);
        if (num<5)
            return true;
        else
            return false;
    }
}
