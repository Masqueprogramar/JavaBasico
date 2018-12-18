package com.masqueprogramar.recursividad;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 15-mayo-2018
 * @description Programa que muestra los primeros n números de catalan 
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/15/mostrar-numeros-catalan-java/
 */

public class NumerosCatalanRecursivo {

	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
				"Introduce el número de elementos a mostrar",
				"Números de Catalan",
				JOptionPane.QUESTION_MESSAGE);
		
		int limite = Integer.parseInt(strLimite);
		
		JTextArea textArea = new JTextArea("");
		textArea.append("n\tCn\n");
		textArea.append("********************\n");
		for(int indice=0;indice<limite;indice++){
			textArea.append(indice + "\t" + calcularNumeroCatalan(indice) + "\n");
		}
		
		JOptionPane.showMessageDialog(null,
				textArea,
				"Números de Catalan",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	static int calcularNumeroCatalan(int num){
		int rdo = 0;
		if(num==0){
			return 1;
		} 
		for(int i=0;i<num;i++){
			rdo += calcularNumeroCatalan(i) * calcularNumeroCatalan(num - i - 1);
		}
		return rdo;
	}
}
