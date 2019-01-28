package com.masqueprogramar.geometria;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 22-enero-2019
 * @description Programa que calcula el área y el volumen de un cubo
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2019/01/22/area-volumen-cubo-java/ 
 */

public class AreaVolumenCubo {

	public static void main(String[] args) {
		
		double arista, area, volumen;
		
		String strArista = JOptionPane.showInputDialog(null, 
				"Introduce la arista de un cubo (cm)", 
				"Área y Volumen de un cubo", 
				JOptionPane.QUESTION_MESSAGE);
		
		arista = Double.parseDouble(strArista);
		area = calcularAreaCubo(arista);
		volumen = calcularVolumenCubo(arista);
		
		String textoMostrar = "El área es " + String.format("%.2f", area) + " cm cuadrados";
		textoMostrar += " y el volumen es " + String.format("%.2f", volumen) + " cm cúbicos.";
				
		JLabel lblVolumen = new JLabel(textoMostrar);
		Font fuente = new Font("Arial", Font.ITALIC, 17);
		lblVolumen.setFont(fuente);
		
		JOptionPane.showMessageDialog(null, 
				lblVolumen, 
				"Área y Volumen de un cubo de arista " + arista + " cm", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	static double calcularAreaCubo(double arista){
		return 6 * Math.pow(arista, 2);
	}
	
	static double calcularVolumenCubo(double arista){
		return Math.pow(arista, 3);
	}

}
