package com.kvalit18.example.Calculator_FilippaL;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		CalculatorBasicOperations objectB = new CalculatorBasicOperations();
		CalculatorAdvancedOperations objectA = new CalculatorAdvancedOperations();
		
		Scanner sc = new Scanner(System.in);
		boolean korProgrammet = true;
		
		while(korProgrammet)		
		{
		
		System.out.print("Välkommen till miniräknaren. Vilket räknesätt vill du använda?"
				+ "\nAddera [1]\nSubtrahera [2]\nMultiplicera [3]\nDividera [4]\n"
				+ "Visa det största av två värden [5]\nVisa det minsta av två värden [6]\n"
				+ "Modulo [7]\nVisa Absolutvärdet [8]\nKvadratrot [9]\n"
				+ "Upphöjt till två [10]\nAvsluta programmet [11]\n\nVälj en av siffrorna: ");
		
		int val = sc.nextInt();
		
		double tal1 = 0;
		double tal2 = 0;
		
		if(val == 1 || val == 2 || val == 3 || val == 4 || val == 5 || val == 6 || val == 7)
		{

		System.out.print("Skriv in första talet: ");
		tal1 = sc.nextDouble();		
		System.out.print("Skriv in andra talet: ");
		tal2 = sc.nextDouble();
		
		}
		else if(val ==8 || val == 9 || val == 10)
		{
			System.out.print("Skriv in talet: ");
			tal1 = sc.nextDouble();
		}
		
		switch(val)
		{
		
		case 1:
			double returnNumberAdd = objectB.methodAdd(tal1, tal2);
			System.out.println("Svar: " + returnNumberAdd);
			break;
			
		case 2:
			double returnNumberSub = objectB.methodSub(tal1, tal2);
			System.out.println("Svar: " + returnNumberSub);
			break;
			
		case 3:
			double returnNumberMulti = objectB.methodMulti(tal1, tal2);
			System.out.println("Svar: " + returnNumberMulti);
			break;
			
		case 4:
			double returnNumberDivi = objectB.methodDivi(tal1, tal2);
			System.out.println("Svar: " + returnNumberDivi);
			break;
			
		case 5:
			double returnNumberGreatest = objectA.methodReturnsGreatest(tal1, tal2);
			System.out.println("Svar: " + returnNumberGreatest);
			break;
			
		case 6:
			double returnNumberSmallest = objectA.methodReturnsSmallest(tal1, tal2);
			System.out.println("Svar: " + returnNumberSmallest);
			break;
			
		case 7:
			double returnNumberModulo = objectA.methodModulo(tal1, tal2);
			System.out.println("Svar: " + returnNumberModulo);
			break;
			
		case 8:
			double returnNumberAbsolute = objectA.methodAbsoluteValue(tal1);
			System.out.println("Svar: " + returnNumberAbsolute);
			break;
			
		case 9:
			double returnNumberSqrt = objectA.methodSqrt(tal1);
			System.out.println("Svar: " + returnNumberSqrt);
			break;
			
		case 10:
			double returnNumberTimesTwo = objectA.methodTimesTwo(tal1);
			System.out.println("Svar: " + returnNumberTimesTwo);
			break;
			
		case 11:
			System.out.println("--------");
			System.out.println("Hejdå");
			korProgrammet = false;
			sc.close();		
		}
			
		}
		
		sc.close();	
	}	
}
