package com.masqueprogramar.recursividad;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 10-enero-2019
 * @description Programa que muestra los N primeros números de la serie de Tribonacci de forma recursiva  
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/10/serie-tribonacci-de-forma-recursiva/ 
 */

public class TribonacciRecursivo {

	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null,
                "Introduce el número de elementos a mostrar",
                "Serie de Tribonacci",
                JOptionPane.QUESTION_MESSAGE);
         
        int limite = Integer.parseInt(strLimite);
        
        JTextArea textArea = new JTextArea("");
        for(int ind=1; ind<=limite; ind++){
            textArea.append(funcionTribonacci(ind) + "\t");
            if(ind%4==0){
            	textArea.append("\n");
            }
        }
         
        JOptionPane.showMessageDialog(null,
                textArea,
                "Serie de Tribonacci",
                JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static int funcionTribonacci(int num){
		if(num == 0 || num == 1 || num == 2){
			return 0;
		} 
		if (num == 3) {
			return 1;
		} else {
			return funcionTribonacci(num-1) + funcionTribonacci(num-2) + funcionTribonacci(num-3); 
		}
	}
}
