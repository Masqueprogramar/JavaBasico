package com.masqueprogramar.matematicas;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 29-enero-2019
 * @description Programa que muestra los primeros n números abundantes 
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/29/numeros-abundantes-en-java
 */

public class NumerosAbundantes {

	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
				"¿Cuantos números abudantes quieres mostrar?",
				"Números Abundantes",
				JOptionPane.QUESTION_MESSAGE);
		
		int limite = Integer.parseInt(strLimite);
		
		JTextArea textArea = new JTextArea("");
		textArea.setFont(new Font("Arial", Font.BOLD, 13));
		int contador = 0, num = 1;
		while(contador < limite){
			if(esNumeroAbundante(num)){
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
				"Números Abundantes",
				JOptionPane.INFORMATION_MESSAGE);

	}
	
	private static boolean esNumeroAbundante(int num){
		int sumaDivisores = 0;
		int aux = 1;
		while(aux <= num/2){
			if(num % aux == 0){
				sumaDivisores += aux;
			}
			aux++;
		}
		return num < sumaDivisores;
	}

}
