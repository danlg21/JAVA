package javaexercises345;

import java.util.Scanner;

public class JavaExercises {

	public static void main(String[] args) {
		
		//Ejercicio 1
		//Operadores Lógicos (&& y ||)
		
		boolean a = false;
		boolean b = false;
		if ( a && b) {
			System.out.println("Both true");
		} else if ( a || b) {
			System.out.println("Only one true");
		} else {
			System.out.println("None of them are true");
		}
		
		
		//Ejercicio 2
		//Operadores Lógicos (!)
		
		boolean c = true;
		if (c != true) {
			System.out.println("Valor original: " + c);
			System.out.println("Valor invertido: true");
		} else {
			System.out.println("Valor original: " + c);
			System.out.println("Valor invertido: false");
		}
		
		
		//Ejercicio 3
		//Determinar si un número es negativo, positivo o cero
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresa tu número");
		int num = scn.nextInt();
		
		if ( num > 0 ) {
			System.out.println("El número es positivo");
		} else {
			if (num == 0) {
				System.out.println("El número es cero");
			} else {
				System.out.println("El número es negativo");
			}
		}
		
		
		//Ejercicio 4
		//Escala de calificaciones
		
		
		System.out.println("Ingresa tu calificación");
		String calificacion = scn.next().toUpperCase();

        switch (calificacion) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Bueno");
                break;
            case "C":
                System.out.println("Suficiente");
                break;
            case "D":
                System.out.println("Insuficiente");
                break;
            case "F":
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificación inválida");
                break;
        }
		
		
		//Ejercicio 5
		//Gestión de notificaciones en una red social
		
		System.out.println("Ingresa un número");
		int note = scn.nextInt();
		
		switch (note) {
		case 1: 
			System.out.println("Tienes un nuevo mensaje"); 
		    break;
		case 2:
			System.out.println("Tienes un nuevo seguidor"); 
			break;
		case 3:
			System.out.println("Tienes una nueva soicitud de amistad");
			break;
		case 4:
			System.out.println("Alguien comentó tu foto");
			break;
		case 5:
			System.out.println("Han aceptado tu solicitud de amistad");
			break;
		default:
			System.out.println("Nada que actualizar");
			break;
		}

		scn.close();
         
	}//method

}//class
