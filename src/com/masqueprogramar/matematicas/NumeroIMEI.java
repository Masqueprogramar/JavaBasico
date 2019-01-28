package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 16-enero-2019
 * @description Programa que compruebe si un número IMEI introducido es válido
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/16/numero-imei-en-java/
 */

public class NumeroIMEI {
	
	public static void main(String[] args) {
		
		// Ejemplo válido 123456789087653
		String strNumeroIMEI = JOptionPane.showInputDialog(null, 
				"Introduce el número IMEI", 
				"Número IMEI", 
				JOptionPane.QUESTION_MESSAGE);
		long numeroIMEI = Long.parseLong(strNumeroIMEI);
		
		String respuesta;
		int icon;
		if(esValidoIMEI(numeroIMEI)){
			respuesta = "Código IMEI válido";
			icon = JOptionPane.INFORMATION_MESSAGE;
		} else {
			respuesta = "Código IMEI no válido";
			icon = JOptionPane.ERROR_MESSAGE;
		}
		
		JOptionPane.showMessageDialog(null,
				respuesta,
				"Número Buzz",
				icon);
		
	}
	
	private static boolean esValidoIMEI(long num){
		
		String strIMEI = String.valueOf(num);
		int longitud = strIMEI.length(); 
		if(longitud != 15){
			return false;
		}
		int digito, suma = 0;
		for (int i = longitud; i >= 1; i--){
			digito = (int) (num % 10);
			
			if(i % 2 == 0){
				digito *= 2;
			}
			suma += sumaDigito(digito);
			num /= 10;
		}
		return (suma % 10 == 0);
	}
	
	private static int sumaDigito(int n){
		int suma = 0;
		while(n > 0){
			suma += n%10;
			n /= 10;
		}
		return suma;
	}

}
