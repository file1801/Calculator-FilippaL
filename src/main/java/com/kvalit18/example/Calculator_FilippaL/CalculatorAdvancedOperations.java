package com.kvalit18.example.Calculator_FilippaL;

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {
	
	
	public double methodReturnsGreatest(double number1, double number2)
	{
		double returnNumber = Math.max(number1, number2);
		return returnNumber;
	}
	
	public double methodReturnsSmallest(double number1, double number2)
	{
		double returnNumber = Math.min(number1, number2);
		return returnNumber;
	}
	
	public double methodModulo(double number1, double number2)
	{
		double returnNumber = number1 % number2;
		return returnNumber;
	}
	
	public double methodAbsoluteValue(double number1)
	{
		double returnNumber = Math.abs(number1);
		return returnNumber;
	}

	public double methodSqrt(double number1)
	{
		double returnNumber = Math.sqrt(number1);
		return returnNumber;
	}
	
	public double methodTimesTwo(double number1)
	{
		double returnNumberTimesTwo = number1 * number1;
		return returnNumberTimesTwo;
	}

	
	
}
