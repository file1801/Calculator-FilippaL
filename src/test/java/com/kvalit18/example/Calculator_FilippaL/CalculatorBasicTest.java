package com.kvalit18.example.Calculator_FilippaL;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class CalculatorBasicTest {
	
	CalculatorBasicOperations c = new CalculatorBasicOperations();
	Random random = new Random();	
	double oracle = 0;
	double randomNumberOne = 0.0;
	double randomNumberTwo = 0.0;

	@Test
	public void methodAddTest()
	{	
		oracle = randomNumberOne + randomNumberTwo;
		assertEquals(c.methodAdd(randomNumberOne, randomNumberTwo),oracle,0);

		for(int i = 0; i < 5; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = randomNumberOne + randomNumberTwo;
		assertEquals(c.methodAdd(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}	
	
	@Test
	public void methodSubTest()
	{	
		oracle = randomNumberOne - randomNumberTwo;
		assertEquals(c.methodSub(randomNumberOne, randomNumberTwo),oracle,0);

		for(int i = 0; i < 5; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = randomNumberOne - randomNumberTwo;
		assertEquals(c.methodSub(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}
	
	@Test
	public void methodMultiTest()
	{	
		oracle = randomNumberOne * randomNumberTwo;
		assertEquals(c.methodMulti(randomNumberOne, randomNumberTwo),oracle,0);

		for(int i = 0; i < 5; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = randomNumberOne * randomNumberTwo;
		assertEquals(c.methodMulti(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}
	
	@Test
	public void methodDiviTest()
	{	
		assertTrue(Double.isNaN(c.methodDivi(randomNumberOne, randomNumberTwo)));//Division by zero returns NaN(not a number)

		for(int i = 0; i < 5; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = randomNumberOne / randomNumberTwo;
		assertEquals(c.methodDivi(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}

}
