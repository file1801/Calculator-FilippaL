package com.kvalit18.example.Calculator_FilippaL;

public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface{

	/**
	 * @author Filippa
	 */
	
	
	/**
	 * This method adds two numbers together and returns the sum
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodAdd(double number1, double number2)
	{
		double returnNumber = number1 + number2;
		return returnNumber;
	}
	
	/**
	 * This method takes one number and subtract it with the second number and returns the result
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodSub(double number1, double number2)
	{
		double returnNumber = number1 - number2;
		return returnNumber;
	}
	
	/**
	 * This method multiply two numbers and returns the result
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodMulti(double number1, double number2)
	{
		double returnNumber = number1 * number2;
		return returnNumber;
	}
	
	/**
	 * This method divides number1 with number2 and returns the result
	 * @param number1
	 * @param number2
	 * @return returnNumber
	 */
	public double methodDivi(double number1, double number2)
	{
		double returnNumber = number1 / number2;
		return returnNumber;
	}

}
