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
	public void methodReturnsGreatest()
	{	
		oracle = Math.max(randomNumberOne, randomNumberTwo);
		assertEquals(c.methodReturnsGreatest(randomNumberOne, randomNumberTwo),oracle,0);
		System.out.println("Testing add method with: " + randomNumberOne + " and " +
		randomNumberTwo + " = " + oracle);

		for(int i = 0; i < 5; i++)
		{
		randomNumberOne = -10 + random.nextDouble() * 20;
		randomNumberTwo = -10 + random.nextDouble() * 20;
		
		oracle = Math.max(randomNumberOne, randomNumberTwo);
		assertEquals(c.methodReturnsGreatest(randomNumberOne, randomNumberTwo),oracle,0);
		System.out.println("Testing add method with: " + randomNumberOne + " and " +
		randomNumberTwo + " = " + oracle);
		}
	}
		
	}

