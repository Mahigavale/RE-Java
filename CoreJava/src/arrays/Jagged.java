package arrays;

import java.util.Scanner;

public class Jagged {
	
	public static void main (String args[])
	{
		
		/**
		 * jagged array is basically that array which will have the uneven number of columns
		 * in each row.
		 * 
		 */
		
		
		//we can take the input from the user to create the specific columns for each row in our table.
		
		
		System.out.println("please enter the number of rows you wanna have in matrix :");
		
		Scanner Scan=new Scanner(System.in);
		
		int rows=Scan.nextInt();
		
		int columns;
		
		int[][] nums=new int [rows][];
		
		for(int i=0;i<rows;i++)
		{
			System.out.println("in row :"+ (i+1));
			System.out.println("enter columns :");
			columns=Scan.nextInt();
			
		 nums[i]=new int[columns];
			
		}
		
		
		
		for(int i=0;i<rows;i++)
		{
			System.out.println("Row :"+ (i+1) + " has columns :" + nums[i].length);
			for(int j=0;j<nums[i].length;j++)
			{
				System.out.println("row:"+ (i+1) +"columns:"+ (j+1));
				
				nums[i][j]=Scan.nextInt();
			}
		}
			
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	
}
}
