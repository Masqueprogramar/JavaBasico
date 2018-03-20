package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 04-enero-2017
 * @description Programa que lea una fecha representada por dos enteros, mes y año, y dé como resultado los días correspondientes del mes      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/04/numero-de-dias-en-un-mes/
 */

public class DiasDelMes {
	
	public static void main(String[] args){
		 
        int mes, anyo, numDias = 0;
        mes = leerEntero("Introduce el mes: ");
        anyo = leerEntero("Introduce el año: "); 
 
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                if((anyo%4==0 && anyo%100!=0) || anyo%400==0){
                    numDias = 29;
                }
                else{
                    numDias = 28;
                }
                break;
            default:
                System.out.println("\nEl mes " + mes + " es incorrecto.");
                break;
        }
 
        if(numDias!=0){
            System.out.println("\nEl mes " + mes + " del año " + anyo + " tiene " + numDias + " días.");
        }
    }
 
    private static int leerEntero(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextInt();
    }

}
