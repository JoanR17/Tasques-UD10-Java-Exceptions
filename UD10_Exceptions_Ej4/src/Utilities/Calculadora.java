package Utilities;

/**
 * @author JOAN
 */

import Exceptions.MyException;

public class Calculadora {
	
	public double suma(double a, double b)
	{
		return a + b;
	}
	
	public double resta(double a, double b)
	{
		return a - b;
	}
	
	public double multiplicacion(double a, double b)
	{
		return a * b;
	}
	
	public double potencia(double a, double b)
	{
		return Math.pow(a, b);
	}
	
	public double raizCuadrada(double a) throws MyException
	{
		if(a < 0)
		{
			throw new MyException("El valor de la raiz no pude ser negativo.\n");
		}
		return Math.sqrt(a);
	}
	
	public double raizCubica(double a) throws MyException
	{
		if(a < 0)
		{
			throw new MyException("El valor de la raiz no pude ser negativo.\n");
		}
		return Math.cbrt(a);
	}
	
	public double division(double a, double b) throws MyException
	{
		if(b == 0)
		{
			throw new MyException("No se puede dividir entre 0.\n");
		}
		return a / b;
	}
}
