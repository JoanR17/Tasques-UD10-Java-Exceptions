package Main;

import Exceptions.MyException;

public class MainApp {

	public static void main(String[] args) {
		
		try 
		{
			System.out.println("Mensaje mostrado por pantalla");
			throw new MyException("Excepcion capturada con mensaje: Esto es un objeto Exception");
		} 
		catch (MyException e) 
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Programa terminado");
	}

}
