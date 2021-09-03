package com.bridgelabz.datastructureproblems;

public class PrintPrimeAnagramsUsingStack {
	private final static int START_NUMBER = 2;
	private final static int END_NUMBER = 1000;
	final static int NUMBER_OF_CHARS = 256;
	
	public static void main(String[] args) {
		Integer[] primeNumberArray = new Integer[200];
		int arrayIndex = 0;
		for (int i = START_NUMBER; i <= END_NUMBER; i++) {
			if (isPrime(i)) {
				primeNumberArray[arrayIndex++] = i;
			}
		}
		for(int i=0;i<arrayIndex-2;i++) {
			for(int j=i+1;j<arrayIndex-1;j++) {
				if(isAnagram(primeNumberArray[i], primeNumberArray[j])) {
					
				}
			}
		}

	}
	public static boolean isPrime(int number) {
		int factors = 0;
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if ((number % j) == 0) {
				factors++;
				break;
			} else
				continue;
		}
		if (factors == 0) {
			return true;
		}
		return false;
	}
	static boolean isAnagram(int number1, int number2) {
		
		char[] num1=Integer.toString(number1).toCharArray();
		char[] num2=Integer.toString(number2).toCharArray();
		int[] count = new int[NUMBER_OF_CHARS];
		for (int i = 0; i < num1.length; i++) {
			count[num1[i] - 'a']++;
			count[num2[i] - 'a']--;
		}
		if (num1.length != num2.length)
			return false;
		for (int i = 0; i < NUMBER_OF_CHARS; i++)
			if (count[i] != 0) {
				return false;
			}
		return true;
	}

}
