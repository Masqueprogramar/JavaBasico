package com.masqueprogramar;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 07-mayo-2018
 * @description Programa que muestra el valor absoluto de un número real introducido por teclado         
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/07/valor-absoluto-numero-real-java/
 */

public class ValorAbsoluto {
	
	public static void main(String[] args) {

		String strNum = JOptionPane.showInputDialog(null, 
				"Introduce un número real: ", 
				"Valor Absoluto", 
				JOptionPane.QUESTION_MESSAGE);
		double num = Double.parseDouble(strNum);
		
		System.out.printf("El valor absoluto de %.2f es %.2f.", 
				num, valorAbsolutoNumero(num));
		
		System.out.printf("%nEl valor absoluto de %.2f es %.2f.", 
				num, Math.abs(num));
	}
	
	static double valorAbsolutoNumero(double num){
		return num>=0?num:-num;
	}
}
