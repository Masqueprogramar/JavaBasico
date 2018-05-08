package com.masqueprogramar;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 04-mayo-2018
 * @description Programa que dado un número en decimal muestre el correspondiente en octal      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/04/decimal-octal-java/ 
 */

public class DecimalAOctal {
	
	public static void main(String[] args) {
				
		String strDecimal = JOptionPane.showInputDialog(null, "Introduce un número decimal: ", 
				"Decimal a Octal", JOptionPane.QUESTION_MESSAGE);
		int decimal = Integer.parseInt(strDecimal);
		
		System.out.println("Decimal a Octal");
		
		// 1º método con toOctalString 
		String octal = Integer.toOctalString(decimal);
		System.out.printf("%nMétodo 1 -> Decimal: %d, Octal: %s", decimal, octal);
		
		// 2º método con array
		char digitosO[]={'0','1','2','3','4','5','6','7'};
		String octal2 = "";
		int resto, aux = decimal;
		
		while(aux>0){
			resto = aux % 8;
			octal2 = digitosO[resto] + octal2;
			aux /= 8; 
		}
		System.out.printf("%n%nMétodo 2 -> Decimal: %d, Octal: %s", decimal, octal2);		
	}
}
