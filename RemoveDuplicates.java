package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		//initializing the values
		String test=("We learn java basics as part of java sessions in java week1");
		String[] arr=test.split(" ");
		String temp="";
		
		//Using LinkedHashSet to maintain insertion order
		LinkedHashSet<String> set=new LinkedHashSet<String>(Arrays.asList(arr));
		
		//Print the array values in String
		for(String singleWord :set)
		{
			temp=temp+singleWord+" ";
			
		}
		System.out.println("The String text after removing duplicates is: "+temp);
		
	}

}
