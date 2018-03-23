package com.masqueprogramar;

import java.util.Scanner;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 22-marzo-2018
 * @description Programa que dado un número en binario muestre el correspondiente en decimal      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/03/22/binario-a-decimal/ 
 */

public class BinarioADecimal {
	
	private static Scanner sc;

	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		boolean esBinario = true;
		int binario, decimal;
		
		do {
			System.out.print("Introduce un número binario: ");
			binario = sc.nextInt();
			esBinario = comprobarBinario(binario);
		} while (!esBinario);
		
		decimal = calcularDecimal(binario);
		System.out.printf("%nBinario: %d, Decimal: %d", binario, decimal);
		
	}
	
	private static int calcularDecimal(int binario){
		int decimal = 0, exponente = 0;
		int digito;
		while(binario>0){
			digito = binario%10;
			decimal = decimal + digito * (int)Math.pow(2, exponente);
			binario /= 10;
			exponente++;
		}
		return decimal;
	}
	
	private static boolean comprobarBinario(int num){		
		int digito;
		while(num>0){
			digito = num%10;
			if(digito!=0 && digito!=1){
				return false;
			}
			num /= 10;
		}
		return true;
	}
}
