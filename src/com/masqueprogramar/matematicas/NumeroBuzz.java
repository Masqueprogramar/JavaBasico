package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-enero-2019
 * @description Programa que compruebe si un número natural introducido por teclado es un número Buzz
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/14/numero-buzz-en-java/ 
 */

public class NumeroBuzz {

	public static void main(String[] args) {
		
		String strNumero = JOptionPane.showInputDialog(null, 
				"Introduce un número entero", 
				"Número Buzz", 
				JOptionPane.QUESTION_MESSAGE);
		int numero = Integer.parseInt(strNumero);
		
		String cadena = "El número " + numero;
		cadena += isBuzzNumber(numero)?"":" no";
		cadena += " es un número Buzz"; 
		
		
		JOptionPane.showMessageDialog(null,
				cadena,
				"Número Buzz",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static boolean isBuzzNumber(int num){
		return (num%7 == 0 || num%10 == 7);
	}

}
