package demor;

import java.util.Scanner;

public class demoee {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the rows :");

		int rows = scan.nextInt();

		int[][] jagged = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.print("the row number" + (i + 1) + " please enter columns:");

			int columns = scan.nextInt();
			jagged[i] = new int[columns];
		}
		
		for(int i=0;i<rows;i++)
		{
			System.out.println("row number :"+(i+1)+"has the columns:"+ jagged[i].length);
			for(int j=0;j<jagged[i].length;j++)
			{
			    System.out.println("enter the element number :"+ (j+1)+"total elements :"+jagged[i].length+"remaining elements:"+(jagged[i].length-(j+1)));
			    
			    jagged[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("*****************************************");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<jagged[i].length;j++)
			{
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	
}
