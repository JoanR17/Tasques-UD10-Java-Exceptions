package Main;

/**
 * @author JOAN
 */

import Exception.MyException;

public class MainApp {

	public static void main(String[] args) 
	{		
		try 
		{
			System.out.println("Generando número aleatorio...");
			
			int numRandom = (int) Math.floor(Math.random()*(999+1));
			
			System.out.println("El numero aleatorio es: " + numRandom);
			
			throw new MyException(numRandom%2);
		} 
		catch (MyException e) 
		{
			System.out.println(e.getMessage());
		}

	}

}
