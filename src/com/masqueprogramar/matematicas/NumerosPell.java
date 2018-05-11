package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 07-mayo-2018
 * @description Programa que muestra los primeros n elementos de la sucesión de Pell        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/07/mostrar-numeros-pell-java/
 */

public class NumerosPell {
	
	public static void main(String[] args) {
	
		String strElementos = JOptionPane.showInputDialog(null, "Introduce el número de elementos a mostrar", 
				"Números Pell", JOptionPane.QUESTION_MESSAGE);
		int elementos = Integer.parseInt(strElementos);
		
		System.out.printf("%n\tNúmeros de Pell%n");
		System.out.println("***********************************");
		int cont = 0;
		int n1=1, n2=0, pell;
		for (int i=0; i<elementos; i++) {
			pell = n1 + 2 * n2;
			System.out.print(pell + "\t");
			n1 = n2;
			n2 = pell;
			cont++;
			if(cont==5){
				System.out.println();
				cont=0;
			}
		}
	}
}
