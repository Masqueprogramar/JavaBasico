package com.masqueprogramar;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 08-mayo-2018
 * @description Programa que muestra los primeros n números pentagonales        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/08/mostrar-numeros-pentagonales-java/
 */

public class NumeroPentagonal {
	
	public static void main(String[] args) {
		String strLimite = JOptionPane.showInputDialog(null, 
				"Introduce el número de elementos a mostrar", 
				"Número Pentagonal", 
				JOptionPane.QUESTION_MESSAGE);
		int limite = Integer.parseInt(strLimite);
		
		System.out.printf("\tNúmeros pentagonales %n");
		System.out.println("************************************");
		
		int cont = 1;
		for(int i=1;i<=limite;i++){
			System.out.print(calcularPentagonal(i) + "\t");
			if(cont % 5 == 0){
				System.out.println();
			}
			cont++;
		}
	}
	
	static int calcularPentagonal(int num){
		return (num * (3 * num - 1)) / 2;
	}
}
