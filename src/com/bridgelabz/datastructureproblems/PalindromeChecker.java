package com.bridgelabz.datastructureproblems;

import com.bridgelabz.stackandqueueproblem.MyQueue;
import com.bridgelabz.stackandqueueproblem.Node;

public class PalindromeChecker 
{

	public static void main(String[] args) 
	{
		String word = "madam";
		
		
		char[] wordArray = word.toCharArray();
		Node<Character> newNode;
		MyQueue<Character> queue = new MyQueue<Character>();
		for (Character character : wordArray) 
		{
			newNode = new Node<Character>(character);
			queue.addRear(newNode);
		}
		queue.printMyNodes();
		boolean isEqual = true;

		while (!queue.isEmpty() && isEqual) 
		{
			char charAtFront = queue.removeFront();
			System.out.println(charAtFront);
			if (queue.isEmpty()) 
			{
				break;
			}

			char charAtRear = queue.removeRear();
			System.out.println(charAtRear);
			if (charAtFront != charAtRear) 
			{
				isEqual = false;
			}
		}
		
		if(isEqual == true)
			System.out.println( word + " is palindrome"); 
		else 
			System.out.println(word + " is not palindrome");

	}

}
