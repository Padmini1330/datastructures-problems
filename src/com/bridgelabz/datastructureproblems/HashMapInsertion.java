package com.bridgelabz.datastructureproblems;

import com.bridgelabz.hashtableproblem.*;

public class HashMapInsertion 
{

	public static void main(String[] args) 
	{
		String sentence= "To be or not to be";
		
		MyLinkedHashMap<String, Integer> linkedHashMap = new MyLinkedHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		
		for(String word:words) 
		{
			Integer value = linkedHashMap.get(word);
			if(value==null)
			{
				value=1;
			}
				
			else 
			{
				value=value+1;
			}
				
			linkedHashMap.add(word, value);	
		}		
		System.out.println(linkedHashMap);
	}

	
}
