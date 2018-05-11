package com.masqueprogramar.matematicas;

import javax.swing.JOptionPane;

public class NumeroRomanoADecimal {
	
	public static void main(String[] args) {
		
		String numRomano = JOptionPane.showInputDialog(null, "Introduce un número romano: ", 
				"Número Romano a Decimal", JOptionPane.QUESTION_MESSAGE);
		
		if(validarNumeroRomano(numRomano)){
			
			
			
		} else {
			System.out.printf("El número romano %s no es válido.", numRomano);
		}
	}
	
	static boolean validarNumeroRomano(String numero){
		return numero.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
	}

}
