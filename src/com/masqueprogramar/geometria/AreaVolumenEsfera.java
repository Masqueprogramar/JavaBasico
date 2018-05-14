package com.masqueprogramar.geometria;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 14-mayo-2018
 * @description Programa que calcula el área y el volumen de una esfera
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/14/area-volumen-esfera-java/ 
 */

public class AreaVolumenEsfera {

	public static void main(String[] args) {
		
		double radio, area, volumen;
		
		String strRadio = JOptionPane.showInputDialog(null, 
				"Introduce el radio de la esfera (cm)", 
				"Área y Volumen de una esfera", 
				JOptionPane.QUESTION_MESSAGE);
		radio = Double.parseDouble(strRadio);
		area = calcularAreaEsfera(radio);
		volumen = calcularVolumenEsfera(radio);
		String textoMostrar = "El área es " + String.format("%.2f", area) + " cm cuadrados";
		textoMostrar += " y el volumen es " + String.format("%.2f", volumen) + " cm cúbicos.";
		
		
		JLabel lblVolumen = new JLabel(textoMostrar);
		Font fuente = new Font("Arial", Font.ITALIC, 17);
		lblVolumen.setFont(fuente);
		
		JOptionPane.showMessageDialog(null, 
				lblVolumen, 
				"Área y Volumen de una esfera de radio " + radio + " cm", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	static double calcularAreaEsfera(double radio){
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
	static double calcularVolumenEsfera(double radio){
		return (4 * Math.PI * Math.pow(radio, 3)) / 3;
	}
}
