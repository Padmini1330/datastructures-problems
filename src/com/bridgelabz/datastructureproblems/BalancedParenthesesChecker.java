package com.bridgelabz.datastructureproblems;

import com.bridgelabz.stackandqueueproblem.MyStack;
import com.bridgelabz.stackandqueueproblem.Node;

public class BalancedParenthesesChecker 
{

	public static void main(String[] args) 
	{
		String expression = "()(())";
		char[] expressionArray = expression.toCharArray();
		Node<Character> newNode;
		MyStack<Character> myStack = new MyStack<Character>();
		int index = 0;
		for (Character character : expressionArray) 
		{
			if (character.equals('(')) 
			{
				newNode = new Node<Character>(character);
				myStack.push(newNode);
			} 
			else if (!myStack.isEmpty() && character.equals(')')) 
			{
				if (myStack.peek().equals('(')) 
				{
					myStack.pop();
				} 
				else 
				{
					break;
				}
			} 
			else
				break;
			
			index++;
		}
		if (myStack.isEmpty() && index == expressionArray.length) 
		{
			System.out.println("Parentheses are balanced!");
		} 
		else 
		{
			System.out.println("Parentheses are not balanced!");
		}


	}

}
