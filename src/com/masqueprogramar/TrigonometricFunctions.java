package com.masqueprogramar;

import javax.swing.JOptionPane;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 08-mayo-2018
 * @description Programa que muestra funciones trigonométricas en Java         
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/08/funciones-trigonometricas-java/
 */

public class TrigonometricFunctions {

	public static void main(String[] args) {

		double degrees, degreesAux, radians, radiansAux;
		double sinValue, cosValue, tanValue;
		double secValue, cosecValue, cotanValue;

		// Obtain angle in degrees
		String strDegrees = JOptionPane.showInputDialog(null,
				"Introduce los grados del ángulo", "Funciones trigonométricas",
				JOptionPane.QUESTION_MESSAGE);

		degrees = Double.parseDouble(strDegrees);

		// Convert degrees to radians
		radians = Math.toRadians(degrees);

		System.out.println("\tFunciones trigonométricas");
		System.out.println("*****************************************");
		System.out.printf("Grados: %f, Radianes: %f%n", degrees, radians);

		// Calculate Sine. Math.sin(a); a angle in radians
		sinValue = Math.sin(radians);
		System.out.printf("%nSeno: sen(%.2f) = %.2f %n", degrees, sinValue);

		// Calculate Cosine. Math.cos(a); a angle in radians
		cosValue = Math.cos(radians);
		System.out.printf("Coseno: cos(%.2f) = %.2f %n", degrees, cosValue);

		// Calculate Tangent. Math.tan(a); a angle in radians
		tanValue = Math.tan(radians);
		System.out.printf("Tangente: tan(%.2f) = %.2f %n", degrees, tanValue);

		// Calculate Sec = 1 / Cosine
		secValue = 1.0 / cosValue;
		System.out.printf("%nSecante: sec(%.2f) = %.2f %n", degrees, secValue);

		// Calculate Cosec = 1 / Sine
		cosecValue = 1.0 / sinValue;
		System.out.printf("Cosecante: cosec(%.2f) = %.2f %n", degrees,
				cosecValue);

		// Calculate Cotangent = 1 / Tangent
		cotanValue = 1.0 / tanValue;
		System.out.printf("Cotangente: cotg(%.2f) = %.2f %n", degrees,
				cotanValue);

		// Calculate arc-sin. Math.asin(a)
		radiansAux = Math.asin(sinValue);
		degreesAux = Math.toDegrees(radiansAux);
		System.out.printf("%nArcoseno: arcsen(%.2f) = %.2f %n", sinValue,
				degreesAux);

		// Calculate arc-cos. Math.acos(a)
		radiansAux = Math.acos(cosValue);
		degreesAux = Math.toDegrees(radiansAux);
		System.out.printf("Arcocoseno arccos(%.2f) = %.2f %n", cosValue,
				degreesAux);

		// Calculate arc-tan. Math.atan(a)
		radiansAux = Math.atan(tanValue);
		degreesAux = Math.toDegrees(radiansAux);
		System.out.printf("Arcotangente arctan(%.2f) = %.2f %n", tanValue,
				degreesAux);
	}
}
