package Main;

/**
 * @author JOAN
 */

import Utilities.InteraccionUsuario;

public class MainApp {

	public static void main(String[] args) {

		int numRandom = (int) Math.floor(Math.random()*(500-1+1)+1);
		InteraccionUsuario user = new InteraccionUsuario();
		
		int intentos = user.usuarioAdivineNum(numRandom);
		
		System.out.println("\nBien hecho, has necesitado " + intentos + " intentos.");

	}
}
