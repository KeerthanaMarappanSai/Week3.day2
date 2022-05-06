package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		//Declaring values to the variables
		int[] data = {3,2,11,4,6,7};
		int temp;
		//Determining length
		temp=data.length-2;
		//Storing values into an array
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<data.length;i++)
		{
		int data1=data[i];
		list.add(data1);
		}
		//Sorting the array
		Collections.sort(list);
		
		System.out.println(list.get(temp));
		

		
	}


}
