package week3.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length=arr.length;
		int count;
		System.out.println("The Duplicates in an Array:" );
		for(int i=0;i<length-1;i++)
		{
			count=0;
			for(int r=i+1; r<length;r++)
			{
				if(arr[i]==arr[r])
				{
					count=count+1;
					
				}
				
			}
			if(count>0)
			{
				System.out.println(arr[i]);
			}
			
		}
	}

}
