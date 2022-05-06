package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		//Declaring values to the variables using List Collection
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		List1.addAll(Arrays.asList(3,2,11,4,6,7));
		List2.addAll(Arrays.asList(1,2,8,4,9,7));
		
		//Intersections of two List
		List1.retainAll(List2);
		
		//Displaying the Intersection values
		System.out.println("The Intersection values in two arrays are: "+List1);
	}
}
