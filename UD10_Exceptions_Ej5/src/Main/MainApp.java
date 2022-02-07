package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exceptions.MyException;
import Objetos.Password;

/**
 * 
 * @author JOAN
 *
 */

public class MainApp {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
		
		try 
		{
			
			System.out.println("Cuantas contraseñas desea crear:");
			int x = teclat.nextInt();
			
			System.out.println("Indique el tamaño de las contraseñas:");
			int len = teclat.nextInt();
			
			if(x < 1 || len < 1)
			{
				throw new MyException("Los valores introducidos tienen que ser positivos.\n");
			}
			
			Password[] passwords = new Password[x];
			boolean[] fuertes = new boolean[x];
			
			rellenarArrays(passwords, fuertes, len);
			mostrarArrays(passwords, fuertes);
			
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("Tienes que introducir un numero entero.\n");
		}		
		catch (MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Fucion que muestra las contraseñas creadas y si son fuertes o no
	 * @param passwords
	 * @param fuertes
	 */
	private static void mostrarArrays(Password[] passwords, boolean[] fuertes) 
	{
		for (int i = 0; i < passwords.length; i++) 
		{
			System.out.println("Contraseña " + (i+1) + " -> " + passwords[i].getPass() + "_" + fuertes[i]);
		}
	}

	/**
	 * Funcion que crea las contraseñas deseadas automaticamente e vincula si es fuerte o no.
	 * @param passwords
	 * @param fuertes
	 * @param len
	 */
	private static void rellenarArrays(Password[] passwords, boolean[] fuertes, int len) 
	{
		for (int i = 0; i < passwords.length; i++) 
		{
			passwords[i] = new Password(len);
			fuertes[i] = passwords[i].esFuerte();
		}
	}

}
