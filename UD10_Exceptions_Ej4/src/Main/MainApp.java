package Main;

/**
 * @author JOAN
 */

import Utilities.*;
import java.util.InputMismatchException;
import Exceptions.MyException;

public class MainApp {

	public static void main(String[] args) {
		
		Interfaz i = new Interfaz();
		int opcion;

		do 
		{
			try 
			{
				System.out.println("Escoge una opcion:\n\t1.Suma\n\t2.Resta\n\t3.Multiplicacion\n\t4.Potencia\n\t5.Raiz Cuadrada\n\t6.Raiz Cubica\n\t7.Division\n\t0.Salir");
				opcion = i.teclat.nextInt();
				
				try 
				{
					i.opcionEscogida(opcion);
				} 
				catch (InputMismatchException e) 
				{
					System.out.println("Debe introducir un numero real.\n");
				}
				catch (MyException e) 
				{
					System.out.println(e.getMessage());
				}
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Debe introducir un numero entero.\n");
				opcion = -1;
			}
			i.teclat.nextLine();
		}
		while (opcion != 0);

	}

}
