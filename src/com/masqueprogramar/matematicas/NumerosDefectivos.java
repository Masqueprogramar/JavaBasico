package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 25-enero-2019
 * @description Programa que muestra los primeros n números defectivos 
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/25/numeros-defectivos-en-java/
 */

public class NumerosDefectivos {

	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
				"¿Cuantos números defectivos quieres mostrar?",
				"Números Defectivos",
				JOptionPane.QUESTION_MESSAGE);
		
		int limite = Integer.parseInt(strLimite);
		
		JTextArea textArea = new JTextArea("");
		int contador = 0, num = 1;
		while(contador < limite){
			if(esNumeroDefectivo(num)){
				textArea.append(num + "\t");
				contador++;
				if(contador % 5 == 0){
					textArea.append("\n");
				}
			}
			num++;
		}
		
		JOptionPane.showMessageDialog(null,
				textArea,
				"Números Defectivos",
				JOptionPane.INFORMATION_MESSAGE);

	}
	
	private static boolean esNumeroDefectivo(int num){
		int sumaDivisores = 0;
		int aux = 1;
		while(aux <= num/2){
			if(num % aux == 0){
				sumaDivisores += aux;
			}
			aux++;
		}
		return num > sumaDivisores;
	}

}
