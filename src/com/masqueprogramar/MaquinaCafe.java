package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 13-marzo-2018
 * @description Programa que simula una máquina expendedora con un único precio para los productos (en este caso serán 45 céntimos). Debe calcular el menor número posible de monedas necesarias para devolver el cambio      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/13/maquina-expendedora/ 
 */

public class MaquinaCafe {
	
	private static final Scanner teclado = new Scanner(System.in); 
    
    public static void main(String[] args) {
         
        final int PRECIO = 45;
        int centimos;
         
        do {
            System.out.print("\nCantidad introducida (en céntimos): ");
            centimos = teclado.nextInt();
            if(centimos<PRECIO){
                System.out.println("Cantidad insuficiente.");
            }
        } while (centimos<PRECIO);
         
        if(centimos==PRECIO){
            System.out.println("Has introducido la cantidad exacta.");
        } else {
            centimos -= PRECIO;
            System.out.printf("%nEl cambio a devolver es el siguiente:");
            if(centimos/200>0){
                System.out.printf("%nMonedas de 2 euros: %d", centimos/200);
                centimos %= 200;
            }
            if(centimos/100>0){
                System.out.printf("%nMonedas de 1 euro: %d", centimos/100);
                centimos %= 100;
            }
            if(centimos/50>0){
                System.out.printf("%nMonedas de 50 céntimos: %d", centimos/50);
                centimos %= 50;
            }
            if(centimos/20>0){
                System.out.printf("%nMonedas de 20 céntimos: %d", centimos/20);
                centimos %= 20;
            }
            if(centimos/10>0){
                System.out.printf("%nMonedas de 10 céntimos: %d", centimos/10);
                centimos %= 10;
            }
            if(centimos/5>0){
                System.out.printf("%nMonedas de 5 céntimos: %d", centimos/5);
                centimos %= 5;
            }
            if(centimos/2>0){
                System.out.printf("%nMonedas de 2 céntimos: %d", centimos/2);
                centimos %= 2;
            }
            if(centimos>0){
                System.out.printf("%nMonedas de 1 céntimo: %d", centimos);
            }
        }
        System.out.printf("%n%nGracias por su compra"); 
    }
}
