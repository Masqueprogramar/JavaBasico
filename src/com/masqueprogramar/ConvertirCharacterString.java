package com.masqueprogramar;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 24-mayo-2018
 * @description       
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/24/character-string-java/ 
 */

public class ConvertirCharacterString {

	public static void main(String[] args) {
		
		//1º método. Character wrapper
		char c = 'A';
		String str = Character.toString(c);
		System.out.println(str + " -> " + str.getClass().getName());
		
		
		//2º método. Character array
		char c2 = 'B';
		char[] array = {c2};
		String str2 = new String(array);
		System.out.println(str2 + " -> " + str2.getClass().getName());
	}
}
