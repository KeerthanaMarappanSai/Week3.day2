package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<arr.length;i++)
		{
		int data1=arr[i];
		list.add(data1);
		}
		//Sorting the array
		Collections.sort(list);
		int length=arr.length;
		
		for(int i=arr[0];i<length;i++)
		{
			if(!list.contains(i))
				System.out.println("The Missing element in an Array is: " +i);
			
		}
		
		
	}
}
