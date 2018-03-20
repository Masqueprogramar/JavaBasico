package com.masqueprogramar;

/**
 * @author masqueprogramar (https://masqueprogramar.wordpress.com)
 * @date 31-diciembre-2016
 * @description Programa que nos muestra el signo del zodiaco de una persona introduciendo el día y el mes de nacimiento        
 * @version 1.0
 * @url https://masqueprogramar.wordpress.com/2016/12/31/signo-del-zodiaco/ 
 */

import java.util.Scanner;

public class SignoZodiaco {
	
	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("¿Cúal es tu signo del zodiaco?");
        System.out.print("Introduce el día de nacimiento: ");
        int dia = sc.nextInt();
 
        System.out.print("Introduce el mes de nacimiento (número): ");
        int mes = sc.nextInt();
 
        sc.close();
        
        String signo = null;
 
        switch (mes) {
            case 1:
                if (dia<=21)
                    signo = "Capricornio";
                else if (dia<=31)
                    signo = "Acuario";
                break;
            case 2:
                if (dia<=21)
                    signo = "Acuario";
                else if (dia<=29)
                    signo = "Piscis";
                break;
            case 3:
                if (dia<=23)
                    signo = "Piscis";
                else if (dia<=31)
                    signo = "Aries";
                break;
            case 4:
                if (dia<=20)
                    signo = "Aries";
                else if (dia<=30)
                    signo = "Tauro";
                break;    
            case 5:
                if (dia<=20)
                    signo = "Tauro";
                else if (dia<=31)
                    signo = "Géminis";
                break;
            case 6:
                if (dia<=20)
                    signo = "Géminis";
                else if (dia<=30)
                    signo = "Cáncer";
                break;
            case 7:
                if (dia<=22)
                    signo = "Cáncer";
                else if (dia<=31)
                    signo = "Leo";
                break;
            case 8:
                if (dia<=22)
                    signo = "Leo";
                else if (dia<=31)
                    signo = "Virgo";
                break;
            case 9:
                if (dia<=22)
                    signo = "Virgo";
                else if (dia<=30)
                    signo = "Libra";
                break;
            case 10:
                if (dia<=22)
                    signo = "Libra";
                else if (dia<=31)
                    signo = "Escorpio";
                break;
            case 11:
                if (dia<=22)
                    signo = "Escorpio";
                else if (dia<=30)
                    signo = "Sagitario";
                break;
            case 12:
                if (dia<=21)
                    signo = "Sagitario";
                else if (dia<=31)
                    signo = "Capricornio";
                break;
            default:
                //System.out.println("El mes introducido no es correcto");
                break;
        }
 
        System.out.println(signo==null?
                "Los datos introducidos no son correctos.":
                "Tu signo del zodiaco es " + signo);
    }

}
