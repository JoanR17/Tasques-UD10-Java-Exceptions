package Utilities;

/**
 * @author JOAN
 */

import java.util.Scanner;

import Exceptions.MyException;

public class Interfaz {

	public Scanner teclat = new Scanner(System.in);

	public void opcionEscogida(int opcion) throws MyException 
	{
		Calculadora cal = new Calculadora();
		double a, b;

		switch (opcion) 
		{
			case 0:
					System.out.println("Adios.");
				break;
			case 1:
				
				System.out.println("Intoduce el primer valor a sumar: ");
				a = teclat.nextDouble();
				System.out.println("Intoduce el segundo valor a sumar: ");
				b = teclat.nextDouble();
				System.out.println(a + " + " + b + " = " + cal.suma(a,b) + "\n");
				
				break;
			case 2:
				
				System.out.println("Intoduce el primer valor a restar: ");
				a = teclat.nextDouble();
				System.out.println("Intoduce el segundo valor a restar: ");
				b = teclat.nextDouble();
				System.out.println(a + " - " + b + " = " + cal.resta(a,b) + "\n");
				
				break;
			case 3:
				
				System.out.println("Intoduce el primer valor a multiplicar: ");
				a = teclat.nextDouble();
				System.out.println("Intoduce el segundo valor a multiplicar: ");
				b = teclat.nextDouble();
				System.out.println(a + " * " + b + " = " + cal.multiplicacion(a,b) + "\n");
				
				break;
			case 4:
				
				System.out.println("Intoduce el valor a potenciar: ");
				a = teclat.nextDouble();
				System.out.println("Intoduce la potencia: ");
				b = teclat.nextDouble();
				System.out.println(a + " ^ " + b + " = " + cal.potencia(a,b) + "\n");
				
				break;
			case 5:
				
				System.out.println("Intoduce el valor de la raiz: ");
				a = teclat.nextDouble();
				System.out.println("Raiz de " + a + " = " + cal.raizCuadrada(a) + "\n");
				
				break;
			case 6:
				
				System.out.println("Intoduce el valor de la raiz: ");
				a = teclat.nextDouble();
				System.out.println("Raiz Cubica de " + a + " = " + cal.raizCubica(a) + "\n");
				
				break;
			case 7:
				
				System.out.println("Intoduce el primer valor a dividir: ");
				a = teclat.nextDouble();
				System.out.println("Intoduce el segundo valor a dividir: ");
				b = teclat.nextDouble();
				System.out.println(a + " / " + b + " = " + cal.division(a, b) + "\n");
				
				break;
			default: System.out.println("Opcion no valida.");
		}
		
	}
	
}
