package core;

import java.util.Scanner;

public class Two_d_array {

	public static void main(String[] args) {
		
		int[][] arr=new int[2][3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println("total length:"+ arr.length);
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}

		

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				 System.out.print(arr[i][j]+" ");
				 
			}
			System.out.println();
		}

		
	}
	
}
