package com.kvalit18.example.Calculator_FilippaL;

public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {
	
	/**
	 * @author Filippa
	 */
	
	
	/**
	 * This method takes two numbers and returns the one with the highest value
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodReturnsGreatest(double number1, double number2)
	{
		double returnNumber = Math.max(number1, number2);
		return returnNumber;
	}
	
	/**
	 * This method takes two numbers and returns the one with the smallest value
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodReturnsSmallest(double number1, double number2)
	{
		double returnNumber = Math.min(number1, number2);
		return returnNumber;
	}
	
	/**
	 * This method takes two numbers and returns the result of number1 modulus number2
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodModulo(double number1, double number2)
	{
		double returnNumber = number1 % number2;
		return returnNumber;
	}
	
	/**
	 * This method takes one number and returns the absolute value
	 * @param number1
	 * @return returnNumber
	 */
	public double methodAbsoluteValue(double number1)
	{
		double returnNumber = Math.abs(number1);
		return returnNumber;
	}

	/**
	 * This method takes one number and returns the square root
	 * @param number1
	 * @return returnNumber
	 */
	public double methodSqrt(double number1)
	{
		double returnNumber = Math.sqrt(number1);
		return returnNumber;
	}
	
	/**
	 * This method takes one number and multiples it with itself
	 * @param number1
	 * @return returnNumber
	 */
	public double methodTimesTwo(double number1)
	{
		double returnNumberTimesTwo = number1 * number1;
		return returnNumberTimesTwo;
	}

	
	
}
