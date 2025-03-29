package core;

import java.util.Scanner;

public class Jagged_array_2 {

	public static void main(String[] args) {
	
		
		int rows=3;
		int[][] jagged= new int[rows][];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<jagged.length;i++)
		{
			System.out.println("For :"+ i +"Enter the Columns:");
			jagged[i]=new int[scan.nextInt()];
		}
		
		for(int i=0;i<jagged.length;i++)
		{
			System.out.println("tatal columns:"+ jagged[i].length);
			
			for (int j=0;j<jagged[i].length;j++)
			{
				jagged[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<jagged.length;i++)
		{
			for (int j=0;j<jagged[i].length;j++)
			{
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}

	}

}
