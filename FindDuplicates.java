package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		List<String> List=new ArrayList<String>();
		List<String> List1=new ArrayList<String>();
		List.add("A");
		List.add("B");
		List.add("C");
		List.add("D");
		List.add("E");
		List.add("A");
		List.add("G");
		List.add("F");
		List.add("C");
		int size = List.size();
		
		for(int i=0; i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				String temp =List.get(i);
				String temp1=List.get(j);
				
				if(temp.equals(temp1))
					
					List1.add(temp);
			}
			
		}
		System.out.println("Duplicates are: "+List1);
	}
}
