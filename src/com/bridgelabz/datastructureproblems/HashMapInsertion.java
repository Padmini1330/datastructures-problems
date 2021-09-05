package com.bridgelabz.datastructureproblems;

import java.util.Scanner;
import java.util.SortedMap;

import com.bridgelabz.linkedlistproblems.*;

public class HashMapInsertion 
{

	public static void main(String[] args) 
	{
		Integer[] number= {2,5,12,1,14,50,21,30,2,5};
		MySortedLinkedList<Integer>[] linkedList=new MySortedLinkedList[11];
		MyNode<Integer> newNode;
		for(int index=0;index<=10;index++) {
			linkedList[index] = new MySortedLinkedList<Integer>();
		}
		for(Integer num:number)
		{
			newNode=new MyNode<Integer>(num);
			int index=getIndex(num);
			linkedList[index].append(newNode);
		}
		printNodes(linkedList);
		
		
		System.out.println("Enter the number to search:");
		Scanner scanner=new Scanner(System.in);
		Integer key=scanner.nextInt();
		int keyIndex=getIndex(key);
		if(linkedList[keyIndex].find(key)!=null)
		{
			linkedList[keyIndex].delete(key);
			printNodes(linkedList);
		}
		else
		{
			newNode=new MyNode<Integer>(key);
			linkedList[keyIndex].append(newNode);
			linkedList[keyIndex].printMyNodes();
			printNodes(linkedList);
		}
		
	}
	public static int getIndex(int number) 
	{
		return number%11;
	}
	public static void printNodes(MySortedLinkedList<Integer>[] ob) {
		for(int i=0;i<11;i++) {
			System.out.println("   ");
			System.out.print(i+"-->");
			ob[i].printMyNodes();
		}
	}	

	
}
