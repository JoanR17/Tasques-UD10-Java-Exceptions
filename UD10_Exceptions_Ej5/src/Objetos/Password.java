package Objetos;

/**
 * 
 * @author JOAN
 *
 */

public class Password {
	
	private int longitud;
	private String pass;
	
	//Constructores
	
	public Password() 
	{
		this.longitud = 8;
	}
	
	public Password(int longitud) 
	{
		this.longitud = longitud;
		generarPassword();
	}
	
	//Getters y Setters

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPass() {
		return pass;
	}
	
	/**
	 * Funcion que devuelve si la contraseña del objeto es fuerte o no
	 * @return
	 */
	public boolean esFuerte()
	{
		int may = 0, min = 0, num = 0;
		
		for (int i = 0; i < pass.length(); i++) 
		{
			if(pass.charAt(i) >= 65 && pass.charAt(i) <= 90)
			{
				may++;
			}
			else if(pass.charAt(i) >= 97 && pass.charAt(i) <= 122)
			{
				min++;
			}
			else if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57)
			{
				num++;
			}
		}
		return (may >= 2 && min >= 1 && num >= 5);
	}
	
	/**
	 * Funcion que genera una contraseña aleatoria
	 */
	public void generarPassword()
	{
		String password = "";
		
		for (int i = 0; i < longitud; i++) 
		{
			int aux;
			do 
			{
				aux = (int)(Math.random()*(122-48+1)+48);
			} 
			while ((aux > 57 && aux < 65) || (aux > 90 && aux < 97));
			password += (char)aux;
		}
		this.pass = password;
	}

}
