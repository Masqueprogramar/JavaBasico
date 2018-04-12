package com.masqueprogramar.util;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @description Métodos útiles tratamiento de fechas en Java   
 * @version 1.0
 * @url http://masqueprogramar.wordpress.com/2016/11/23/funcion-numero-de-dias-entre-dos-fechas-en-java/
 * @url http://masqueprogramar.wordpress.com/2016/11/18/funcion-sumar-dias-a-una-fecha/
 */

public class UtilesFecha {

	/**
	 * Método estático que devuelve el número de dias entre dos fechas
	 * @url https://masqueprogramar.wordpress.com/2016/11/23/funcion-numero-de-dias-entre-dos-fechas-en-java/
	 * @param fecha1 primera fecha para el cálculo
	 * @param fecha2 segunda fecha para el cálculo
	 * @return un valor entero con el número de días entre ambas fechas
	 */
	public static int numeroDiasEntreDosFechas(Date fecha1, Date fecha2){
	     long startTime = fecha1.getTime();
	     long endTime = fecha2.getTime();
	     long diffTime = endTime - startTime;
	     return (int)TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	}
	
	/**
	 * Método estático que añade o resta periodos de tiempo a una fecha dada 
	 * @url https://masqueprogramar.wordpress.com/2016/11/18/funcion-sumar-dias-a-una-fecha/	 
	 * @param fecha, fecha inicial   
	 * @param campo tipo de periodo (pe. Calendar.HOUR) 
	 * @param valor cantidad de tiempo a añadir o restar
	 * @return fecha modificada con el valor y campo especificados
	 */
	public static Date variarFecha(Date fecha, int campo, int valor){
	      if (valor==0) return fecha;
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); 
	      calendar.add(campo, valor); 
	      return calendar.getTime(); 
	}
	
	/**
	 * Método estático que devuelve el número de días que tiene el mes de una fecha 
	 * @param fecha
	 * @return número de días del mes correspondiente
	 */
	public static int numeroDiasMes(Date fecha){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);	
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
}
