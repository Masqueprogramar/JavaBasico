package com.masqueprogramar;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 07-mayo-2018
 * @description Programa que muestra los números narcisistas de 0 hasta un número introducido por teclado        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/07/mostrar-numeros-narcisistas-java/
 */

public class NumerosNarcisistas {
	
	public static void main(String[] args) {
		
		String strLimite = JOptionPane.showInputDialog(null, "Introduce el límite: ", 
				"Números narcisistas", JOptionPane.QUESTION_MESSAGE);
		int limite = Integer.parseInt(strLimite);
		
		System.out.printf("%nNúmeros narcisistas del 0 al %d%n",limite);
		System.out.println("*********************************");
		int cont = 0;
		for(int i=0;i<=limite;i++){
			if(esNumarcisista(i)){
				System.out.print(i + "\t");
				cont++;
			}
			if(cont==5){
				System.out.println();
				cont=0;
			}
		}
	}
		
	private static boolean esNumarcisista(int num) {
		int numDigitos = numDigitos(num);
		int rdo = 0, resto = 0, aux = num;
		while(aux>0){
			resto = aux%10;
			rdo += Math.pow(resto, numDigitos);
			aux /= 10;
		}
		return rdo==num;
	}

	private static int numDigitos(int num){
		int digitos = 0;
		while(num>0){
			digitos++;
			num /= 10;
		}
		return digitos;
	}
}
