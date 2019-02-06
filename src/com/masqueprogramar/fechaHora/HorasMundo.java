package com.masqueprogramar.fechaHora;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 09-mayo-2018
 * @description Programa que muestra la hora actual de varias ciudades del mundo      
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2018/05/09/mostrar-horas-mundo-java/ 
 */

public class HorasMundo {
	
	public static void main(String[] args) {
		System.out.println("\tHoras del Mundo");
		System.out.println("*******************************");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(TimeZone.getTimeZone("America/Vancouver"));
		System.out.println("Hora en Vancouver: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
		System.out.println("Hora en Ciudad de México: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("America/Havana"));
		System.out.println("Hora en La Habana: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("America/Argentina/Ushuaia"));
		System.out.println("Hora en Ushuaia: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Europe/Belfast"));
		System.out.println("Hora en Belfast: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Europe/Rome"));
		System.out.println("Hora en Roma: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Africa/Cairo"));
		System.out.println("Hora en El Cairo: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
		System.out.println("Hora en Moscu: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Asia/Hebron"));
		System.out.println("Hora en Hebron: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Asia/Kathmandu"));
		System.out.println("Hora en Kathmandú: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
		System.out.println("Hora en Ho Chi Minh: " + getHoraFormato(calendar));
		
		calendar.setTimeZone(TimeZone.getTimeZone("Pacific/Auckland"));
		System.out.println("Hora en Auckland: " + getHoraFormato(calendar));
		
		
		//Mostrar TimeZone	
		/*for (String timeZone : TimeZone.getAvailableIDs()) {
			System.out.println(timeZone);
		}*/
	}
	
	static String getHoraFormato(Calendar cal){
		String hora = cal.get(Calendar.HOUR_OF_DAY) + ":" +
					cal.get(Calendar.MINUTE) + ":" + 
					cal.get(Calendar.SECOND);
		return hora;
	}
}
