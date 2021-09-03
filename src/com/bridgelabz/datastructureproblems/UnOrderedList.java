package com.bridgelabz.datastructureproblems;

import com.bridgelabz.linkedlistproblems.MyLinkedList;
import com.bridgelabz.linkedlistproblems.MyNode;

public class UnOrderedList {

	public static void main(String[] args) {
		String sentence = "aaa bbb ccc abc cde efg aaa";
		String[] words = sentence.toLowerCase().split(" ");
		MyNode<String> newNode;
		MyLinkedList<String> linkedList = new MyLinkedList<String>();
		for (String word : words) 
		{
			if (linkedList.find(word) == null) 
			{
				newNode = new MyNode<String>(word);
				linkedList.append(newNode);
				System.out.println(word + " is added ");
			} 
			else 
			{
				linkedList.delete(word);
				System.out.println(word + " is deleted ");
			}
		}
		linkedList.printMyNodes();
	}
}
