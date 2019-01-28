package com.masqueprogramar;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 24-enero-2019
 * @description Programa que muestre por pantalla la tabla pitagórica        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/24/tabla-pitagorica-en-java
 */

public class TablaPitagorica {

	public static void main(String[] args) {
		
		System.out.print(" X|\t");
		
		for(int i=0;i<=10;i++){
			System.out.print(i + "\t");
			if(i==10){
				System.out.println();
			}
		}
		
		
		for(int i=0;i<=10;i++){
			System.out.print("*********");
			if(i==10){
				System.out.println();
			}
		}		
		
		
		for(int i=0; i<=10; i++){
			
			if(i!=10){
				System.out.print(" ");
			}
			System.out.print(i + "|\t");
			
			for(int j=0; j<=10; j++){
				System.out.print((i*j) + "\t");
				
			}
			System.out.println();
		}
	}
}
