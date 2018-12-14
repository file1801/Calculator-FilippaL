package com.kvalit18.example.Calculator_FilippaL;

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface{
	
	
	public double methodAdd(double number1, double number2)
	{
		double returnNumber = number1 + number2;
		return returnNumber;
	}
	
	public double methodSub(double number1, double number2)
	{
		double returnNumber = number1 - number2;
		return returnNumber;
	}
	
	public double methodMulti(double number1, double number2)
	{
		double returnNumber = number1 * number2;
		return returnNumber;
	}
	
	public double methodDivi(double number1, double number2)
	{
		double returnNumber = number1 / number2;
		return returnNumber;
	}

}
