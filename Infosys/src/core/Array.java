package core;

public class Array {
	
	public static void main(String args[]) {
		
		
		double[] arr=new double[3]; // if we don't provide any value to it then it takes default
		
		int[] arr2= new int[]{1,2,3,5};
		
		int [] arr3= {10,20,30};
		
		for(double i: arr)
		{
			System.out.println(i);
		}
		
		System.out.println("***************");
		
		for(int i: arr2)
		{
			System.out.println(i);
		}
		
		System.out.println("******************");
		
		for(int i: arr3)
		{
			System.out.println(i);
		}
		
		System.out.println("***********************");
	}

}
