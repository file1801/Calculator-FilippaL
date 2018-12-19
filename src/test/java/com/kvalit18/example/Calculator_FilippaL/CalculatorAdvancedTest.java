package com.kvalit18.example.Calculator_FilippaL;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;

public class CalculatorAdvancedTest {
	
	CalculatorAdvancedOperations c = new CalculatorAdvancedOperations();
	Random random = new Random();
	double oracle = 0;
	double randomNumberOne = 0.0;
	double randomNumberTwo = 0.0;

	@Test
	public void methodReturnsGreatestTest()
	{	
		oracle = Math.max(randomNumberOne, randomNumberTwo);
		assertEquals(c.methodReturnsGreatest(randomNumberOne, randomNumberTwo),oracle,0);

		for(int i = 0; i < 50; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = Math.max(randomNumberOne, randomNumberTwo);
		assertEquals(c.methodReturnsGreatest(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}
	
	@Test
	public void methodReturnsSmallestTest()
	{	
		oracle = Math.min(randomNumberOne, randomNumberTwo);
		assertEquals(c.methodReturnsSmallest(randomNumberOne, randomNumberTwo),oracle,0);

		for(int i = 0; i < 50; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = Math.min(randomNumberOne, randomNumberTwo);
		assertEquals(c.methodReturnsSmallest(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}
	
	@Test
	public void methodModuloTest()
	{	
		oracle = randomNumberOne % randomNumberTwo;
		assertEquals(c.methodModulo(randomNumberOne, randomNumberTwo),oracle,0);

		for(int i = 0; i < 50; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = randomNumberOne % randomNumberTwo;
		assertEquals(c.methodModulo(randomNumberOne, randomNumberTwo),oracle,0);
		}
	}
	
	@Test
	public void methodAbsolueValueTest()
	{	
		oracle = Math.abs(randomNumberOne);
		assertEquals(c.methodAbsoluteValue(randomNumberOne),oracle,0);

		for(int i = 0; i < 50; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = Math.abs(randomNumberOne);
		assertEquals(c.methodAbsoluteValue(randomNumberOne),oracle,0);
		}
	}
	
	@Test
	public void methodSqrtTest()
	{	
		oracle = Math.sqrt(randomNumberOne);
		assertEquals(c.methodSqrt(randomNumberOne),oracle,0);

		for(int i = 0; i < 50; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = Math.sqrt(randomNumberOne);
		assertEquals(c.methodSqrt(randomNumberOne),oracle,0);
		}
	}
	
	@Test
	public void methodTimesTwoTest()
	{	
		oracle = randomNumberOne * randomNumberOne;
		assertEquals(c.methodTimesTwo(randomNumberOne),oracle,0);

		for(int i = 0; i < 50; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = randomNumberOne * randomNumberOne;
		assertEquals(c.methodTimesTwo(randomNumberOne),oracle,0);
		}
	}
	
	}

