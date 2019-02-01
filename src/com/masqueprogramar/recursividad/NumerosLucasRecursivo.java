package com.masqueprogramar.recursividad;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 29-enero-2019
 * @description Programa que muestra los N primeros números Lucas de forma recursiva  
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/29/numeros-de-lucas-recursivo/ 
 */


public class NumerosLucasRecursivo {
	
	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
				"Introduce el número de elementos a mostrar",
				"Números de Lucas",
				JOptionPane.QUESTION_MESSAGE);
		
		int limite = Integer.parseInt(strLimite);
		
		JTextArea textArea = new JTextArea("");
		textArea.append("La secuencia de números Lucas es:\n\n");
		for(int aux=0; aux<limite; aux++){
			textArea.append(funcionNumLucas(aux) + "\t");
			if((aux+1) % 4 == 0){
				textArea.append("\n");
			}
		}
		
		JOptionPane.showMessageDialog(null,
				textArea,
				"Números de Lucas",
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	private static int funcionNumLucas(int num){
		if(num == 0){
			return 2;
		} else if (num == 1) {
			return 1;
		} else {
			return funcionNumLucas(num-1) + funcionNumLucas(num-2);
		}
		
	}

}
