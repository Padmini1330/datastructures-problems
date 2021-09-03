package com.bridgelabz.datastructureproblems;

import java.util.Arrays;

import com.bridgelabz.stackandqueueproblem.MyQueue;
import com.bridgelabz.stackandqueueproblem.MyStack;
import com.bridgelabz.stackandqueueproblem.Node;

public class PrimeAnagramsUsingQueue 

{
	private final static int LOWER_RANGE = 0;
	private final static int UPPER_RANGE = 1000;

	public static void main(String[] args) 
	
	{

		Integer[] prime = new Integer[200];
		int arrayIndex = 0;
		for (int i = LOWER_RANGE; i <= UPPER_RANGE; i++) 
		{
			if (isPrime(i)) 
			{
				prime[arrayIndex++] = i;
			}
		}
		Node<Integer> firstNode, secondNode;
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		for (int i = 0; i < arrayIndex - 2; i++) 
		{
			for (int j = i + 1; j < arrayIndex - 1; j++) 
			{
				if (isAnagram(prime[i] + "", prime[j] + "")) 
				{
					myQueue.addRear(new Node<Integer>(prime[i]));
					myQueue.addRear(new Node<Integer>(prime[j]));

				}
			}
		}
		while(!myQueue.isEmpty()) 
		{
			System.out.println(myQueue.removeRear());
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

	static boolean isAnagram(String number1, String number2) 
	{

		char[] num1 = number1.toString().toCharArray();
		char[] num2 = number2.toString().toCharArray();
		Arrays.sort(num1);
		Arrays.sort(num2);
		num1.toString();
		num2.toString();
		if ((new String(num1)).equals(new String(num2)))
			return true;
		else
			return false;
	}
}
