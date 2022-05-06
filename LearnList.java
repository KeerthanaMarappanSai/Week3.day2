package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<Integer> List = new ArrayList<Integer>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(1);
		List.add(4);
		List.add(5);
		List.add(1);
		List.add(6);
		int size =List.size();
		int temp=0;
		for(int i=0;i<size;i++)
		{
			if(List.get(i)==1)
			{
				temp=temp+1;
			}
				
		}
		System.out.println("The number of 1 in the list is "+temp);
		
	}
}
