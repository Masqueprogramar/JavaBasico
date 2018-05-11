package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-mayo-2018
 * @description Programa que muestra los primeros n números de Fermat
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/10/mostrar-numeros-fermat-java/
 */

public class NumerosFermat {
	
	public static void main(String[] args) {
		String strLimite = JOptionPane.showInputDialog(null, 
				"Introduce el número de elementos a mostrar", 
				"Números de Fermat", 
				JOptionPane.QUESTION_MESSAGE);
		int limite = Integer.parseInt(strLimite);
				
		String datosMostrar = "";
		
		for(int i=0;i<limite;i++){
			datosMostrar += calcularNumerosFermat(i) + "\n";
		}
		
		JOptionPane.showMessageDialog(null, 
				datosMostrar, 
				"Números de Fermat", 
				JOptionPane.INFORMATION_MESSAGE);
	}

	private static double calcularNumerosFermat(int i) {
		return Math.pow(2, Math.pow(2, i)) + 1;
	}
}
