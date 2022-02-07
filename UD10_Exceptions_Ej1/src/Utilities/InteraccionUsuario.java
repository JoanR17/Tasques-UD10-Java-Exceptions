package Utilities;

/**
 * @author JOAN
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteraccionUsuario {
	
	private static Scanner teclat = new Scanner(System.in);

	/**
	 * Funcion que interactua con el usuario
	 * @param numRandom
	 * @return Devuelve el numero de intentos
	 */
	public int usuarioAdivineNum(int numRandom) 
	{
		int i = 0;
		boolean coincide = false;
		
		do 
		{
			try 
			{
				System.out.println("Adivina el numero entre 1 y 500:");
				int intento = teclat.nextInt();
				
				if(intento != numRandom)
				{
					pista(numRandom, intento);
				}
				else
				{
					coincide = true;
				}
				
				i++;
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Debes introducir un numero entero.\n");
			}
		} 
		while (!coincide);
		
		return i;
	}

	/**
	 * Funcion que da una pista al usuario de si el numero introducido es mayor o menor.
	 * @param numRandom
	 * @param intento
	 */
	private void pista(int numRandom, int intento) 
	{
		if(numRandom > intento)
		{
			System.out.println("El numero que has introducido es MENOR al que debes adivinar.\n");
		}
		else
		{
			System.out.println("El numero que has introducido es MAYOR al que debes adivinar.\n");
		}
	}

}
