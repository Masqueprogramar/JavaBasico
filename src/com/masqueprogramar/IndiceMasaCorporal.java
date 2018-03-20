package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-marzo-2017
 * @description Programa que pide al usuario su altura y peso, y muestra por pantalla el índice de masa corporal (IMC). IMC = peso(kg)/altura^2 (m)        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/03/14/indice-masa-corporal-imc/ 
 */

public class IndiceMasaCorporal {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu altura en metros: ");
        double altura = sc.nextDouble();
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = sc.nextDouble();
        sc.close();
 
        double imc = calcularIMC(altura, peso);
 
        String clasificacion = "";
        if(imc < 16){
            clasificacion = "Infrapeso: Delgadez severa";
        } else if(imc < 17){
            clasificacion = "Infrapeso: Delgadez moderada";
        } else if(imc < 18.50){
            clasificacion = "Infrapeso: Delgadez aceptable";
        } else if(imc < 25){
            clasificacion = "Peso normal";
        } else if(imc < 30){
            clasificacion = "Sobrepeso";
        } else if(imc < 35){
            clasificacion = "Obeso: Tipo 1";
        } else if(imc < 40){
            clasificacion = "Obeso: Tipo 2";
        } else {
            clasificacion = "Obeso: Tipo 3";
        }
 
        System.out.println("\nTu índice de masa corporal es: " + imc);
        System.out.println("Atendiendo al IMC, tiene: " + clasificacion);
 
    }
 
    private static double calcularIMC(double altura, double peso){
        double imc = peso/(Math.pow(altura, 2));
        return Math.rint(imc*100)/100;
    }
}
