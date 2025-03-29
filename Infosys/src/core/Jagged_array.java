package core;

public class Jagged_array {

	public static void main(String[] args) {
		
		int [] arr= {10,34,33,22,21,17,19,18};
		
		//16
		
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
				
			{
				second=largest;
				largest=arr[i];
			}
			else if( arr[i]>second && arr[i] !=largest)
			{
				second= arr[i];
			}
		}
		
		System.out.println("Largest:"+largest);
		
		System.out.println("Second:"+ second);
	
		
}
}
