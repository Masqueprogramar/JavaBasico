package com.masqueprogramar.operadores;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 25-enero-2017
 * @description Ejemplo operador condicional ternario       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/25/operador-condicional-ternario/
 */

public class OperadorCondicionalTernario {
	
	public static void main(String[] args) {
		 
        int num1 = 3;
        int num2 = 7;
 
        int max = (num1>num2)?num1:num2;
        System.out.printf("El número máximo es el %d.%n", max);
 
        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }
        System.out.printf("El número máximo es el %d.%n", max);
 
        double velocidad = 125.7;
        String mensaje = (velocidad<60)?"Vas a una velocidad un poco lenta":
                    (velocidad<=120)?"Vas a la velocidad adecuada":"Vas a una velocidad excesiva";
        System.out.println("\n" + mensaje);
 
    }
}
