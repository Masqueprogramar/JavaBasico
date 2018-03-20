package com.masqueprogramar;

import java.util.Random;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 16-enero-2017
 * @description Programa que simule el comportamiento del termómetro mediante la generación de una temperatura aleatoria en una escala entre el -10 y el 45 y devuelva como resultado un mensaje con la sensación térmica correspondiente      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/16/ejemplo-if-else-anidados/ 
 */

public class SensacionTermica {
	
	public static void main(String[] args) {
        int temp;
        String mensaje = "";
        Random r = new Random();
        temp = r.nextInt(55)-10;
 
        if(temp<10){
            mensaje = "Hace mucho frío.";
        }
        else{
            if(temp<15){
                mensaje = "Hace poco frío.";
            }
            else{
                if(temp<25){
                    mensaje = "Hace una temperatura normal.";
                }
                else{
                    if(temp<30){
                        mensaje = "Hace poco calor.";
                    }
                    else{
                        mensaje = "Hace mucho calor.";
                    }
                }
            }
        }
        System.out.printf("La temperatura actual es de %d grados.", temp);
        System.out.println("\n" + mensaje);

    }

}
