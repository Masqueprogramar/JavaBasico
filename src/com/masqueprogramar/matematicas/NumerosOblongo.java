package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-mayo-2018
 * @description Programa que muestra los primeros n números oblongo (rectangular, número prónico, o número heteromécico)
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/10/mostrar-numeros-oblongo-java/
 */

public class NumerosOblongo {
	
	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
				"Introduce el número de elementos a mostrar",
				"Números Oblongo",
				JOptionPane.QUESTION_MESSAGE);
		int limite = Integer.parseInt(strLimite);
		
		String datosMostrar = "";
		
		for(int indice=0;indice<limite;indice++){
			datosMostrar += calcularSerieOblongo(indice) + "\n";
		}
		
		JOptionPane.showMessageDialog(null,
				datosMostrar,
				"Números Oblongo",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	static int calcularSerieOblongo(int num) {
		return (int)Math.pow(num, 2) + num;
	}
}
