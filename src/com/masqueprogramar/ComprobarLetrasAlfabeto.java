package com.masqueprogramar;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 30-enero-2019
 * @description Programa que dado un String nos muestre si contiene todas las letras del alfabeto (exceptuando la ñ)      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/30/comprobar-string-todas-letras-alfabeto 
 */

public class ComprobarLetrasAlfabeto {

	public static void main(String[] args) {
		
		String frase = "Le gustaba cenar un exquisito sándwich de jamón con zumo de piña y vodka fría.";
		
		System.out.printf("%s%n%n", frase);
		
		if(comprobarTodasLetras(frase)){
			System.out.println("La frase tiene todas las letras.");
		} else {
			System.out.println("La frase NO tiene todas las letras.");
		}
		
		if(comprobarTodasLetrasExpresionesRegulares(frase)){
			System.out.println("La frase tiene todas las letras (utilizando expresiones regulares).");
		} else {
			System.out.println("La frase NO tiene todas las letras (utilizando expresiones regulares).");
		}
		
		if(comprobarTodasLetrasStream(frase)){
			System.out.println("La frase tiene todas las letras (utilizando Java 8 Stream).");
		} else {
			System.out.println("La frase NO tiene todas las letras (utilizando Java 8 Stream).");
		}
		
	}
	
	private static boolean comprobarTodasLetras(String frase){
		
		boolean[] arrayLetras = new boolean[26];
		frase = frase.toLowerCase();
		char letra;
		int index;
		for(int i=0; i < frase.length(); i++){			
			letra = frase.charAt(i);
			if('a' <= letra && letra <= 'z'){
				index = letra - 'a';
				arrayLetras[index] = true;
			}
		}
		
		for(int i = 0; i < arrayLetras.length; i++){
			if(!arrayLetras[i]){
				return false;
			}
		}
		return true;
	}
	
	private static boolean comprobarTodasLetrasExpresionesRegulares(String frase){
		int cont = frase.toLowerCase()
				.replaceAll("[^a-z]", "")
				.replaceAll("(.)(?=.*\\1)", "")
				.length();
		return cont == 26;
	}
	
	private static boolean comprobarTodasLetrasStream(String frase){
		long cont = frase.toLowerCase().chars()
				.filter(l -> l >= 'a' && l <= 'z')
				.distinct()
				.count();
		return cont == 26;
	}

}
