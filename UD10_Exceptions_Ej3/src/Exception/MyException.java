package Exception;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int par_impar;
	
	public MyException(int par_impar) 
	{
		this.par_impar = par_impar;
	}
	
	@Override
	public String getMessage() 
	{
		if(par_impar == 0)
		{
			return "Es par";
		}
		
		return "Es impar";
	}
}
