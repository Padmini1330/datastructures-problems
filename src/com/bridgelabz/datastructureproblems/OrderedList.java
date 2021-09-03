package com.bridgelabz.datastructureproblems;

import com.bridgelabz.linkedlistproblems.*;

public class OrderedList 
{

	public static void main(String[] args) 
	{

		Integer[] numbers = { 20, 50, 13, 6, 15, 4, 9 };
		MyNode<Integer> newNode;
		MySortedLinkedList<Integer> sortedLinkedList = new MySortedLinkedList<Integer>();
		for (Integer number : numbers) 
		{
			if (sortedLinkedList.find(number) == null) 
			{
				newNode = new MyNode<Integer>(number);
				sortedLinkedList.append(newNode);
				System.out.println(number + " is added");
			} 
			else 
			{
				sortedLinkedList.delete(number);
				System.out.println(number + " is deleted");
			}
		}
		sortedLinkedList.printMyNodes();

	}

}
