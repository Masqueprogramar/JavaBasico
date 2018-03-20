package com.masqueprogramar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 04-enero-2017
 * @description Programa que lea una fecha representada por dos enteros, mes y año, y dé como resultado los días correspondientes del mes      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2017/01/04/numero-de-dias-en-un-mes/
 */

public class DiasDelMes_2 {

	public static void main(String[] args){
		 
	    int mes, anyo, numDias = 0;
	    mes = leerEntero("Introduce el mes: ");
	    anyo = leerEntero("Introduce el año: ");
	    Calendar fecha = Calendar.getInstance();
	    fecha.set(anyo, mes, 0);
	    numDias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
	    System.out.println("\nEl mes " + mes + " del año " + anyo + " tiene " + numDias + " días.");
	 
	}
	
	private static int leerEntero(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextInt();
    }
	
}
