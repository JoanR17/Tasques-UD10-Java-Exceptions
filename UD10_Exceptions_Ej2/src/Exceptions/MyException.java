package Exceptions;

public class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public MyException(String mensaje) 
	{
		this.mensaje = mensaje;
	}
	

	@Override
	public String getMessage() 
	{
		return mensaje;
	}

}
