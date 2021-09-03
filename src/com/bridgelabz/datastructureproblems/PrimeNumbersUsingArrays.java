package com.bridgelabz.datastructureproblems;

public class PrimeNumbersUsingArrays 
{
	private final static int LOWER_RANGE = 2;
	private final static int UPPER_RANGE = 1000;
	
	static int numberOfPrime = 0;

	public static void main(String[] args) 
	{
		Integer[][] prime = new Integer[100][100];
		Integer[] OneDArray = new Integer[200];
		int arrayIndex = 0;
		
		
		for (int i = LOWER_RANGE; i <= UPPER_RANGE; i++) 
		{
			if (isPrime(i)) 
			{
				OneDArray[arrayIndex++] = i;
				numberOfPrime++;
			}
		}

		int index = 0;
		for (int i = 0; i < 100; i++) 
		{
			for (int j = 0; j < 1; j++) 
			{
				prime[i][j] = OneDArray[index++];
			}
		}

		for (int i = 1; i < 100; i++) 
		{
			for (int j = 0; j < 1; j++) 
			{
				prime[j][i] = OneDArray[index++];
			}
		}

		for (int i = 0; i < 100; i++) 
		{
			for (int j = 0; j < 100; j++) 
			{
				System.out.print(prime[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static boolean isPrime(int number) 
	{
		int factors = 0;
		for (int j = 2; j <= Math.sqrt(number); j++) 
		{
			if ((number % j) == 0) 
			{
				factors++;
				break;
			} 
			else
				continue;
		}
		if (factors == 0) 
		{
			return true;
		}
		return false;
	}
}