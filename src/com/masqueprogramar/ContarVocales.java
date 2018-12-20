package com.masqueprogramar;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 23-mayo-2018
 * @description Programa que introducida una frase, muestre el número de apariciones de cada vocal      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/23/contar-vocales-java/ 
 */

public class ContarVocales {

	public static void main(String[] args) {
		
		int[] vocales = new int[5];
		String frase = JOptionPane.showInputDialog(null, 
				"Introduce una frase", 
				"Contar el número de vocales", 
				JOptionPane.QUESTION_MESSAGE);
		char caracter;
		for(int i=0;i<frase.length();i++){
			caracter = Character.toLowerCase(frase.charAt(i));

			switch (caracter) {
			case 'a':
				vocales[0]++;
				break;
			case 'e':
				vocales[1]++;
				break;
			case 'i':
				vocales[2]++;
				break;
			case 'o':
				vocales[3]++;
				break;
			case 'u':
				vocales[4]++;
				break;
			default:
				break;
			}
		}

		JTextArea textArea = new JTextArea("");
        textArea.append("Vocal\tVeces\n");
        textArea.append("*********************\n");
        textArea.append("a\t" + vocales[0] + "\n");
        textArea.append("e\t" + vocales[1] + "\n");
        textArea.append("i\t" + vocales[2] + "\n");
        textArea.append("o\t" + vocales[3] + "\n");
        textArea.append("u\t" + vocales[4] + "\n");
        
        JOptionPane.showMessageDialog(null,
                textArea,
                "Apariciones vocales",
                JOptionPane.INFORMATION_MESSAGE);

	}
}
