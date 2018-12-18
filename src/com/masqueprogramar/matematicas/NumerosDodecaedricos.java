package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 25-mayo-2018
 * @description Programa que muestra los primeros n números dodecaedricos 
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/25/mostrar-numeros-dodecaedricos-java/
 */

public class NumerosDodecaedricos {
	
	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
				"Introduce el número de elementos a mostrar",
				"Números Dodecaedricos",
				JOptionPane.QUESTION_MESSAGE);
		
		int limite = Integer.parseInt(strLimite);
		
		JTextArea textArea = new JTextArea("");
		textArea.append("n\tDodecaedrico\n");
		textArea.append("***************************\n");
		for(int indice=0;indice<limite;indice++){
			textArea.append(indice + "\t" + calcularNumeroDodecaedrico(indice) + "\n");
		}
		
		JOptionPane.showMessageDialog(null,
				textArea,
				"Números Dodecaedricos",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private static int calcularNumeroDodecaedrico(int indice) {
		return indice * (3 * indice - 1) * (3 * indice - 2) / 2;
	}

}
