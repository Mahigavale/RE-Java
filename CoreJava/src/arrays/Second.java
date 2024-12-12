package arrays;

public class Second {

	public static void main(String[] args) {
		/**
		 *  Two dimensional arrays are the arrays having rows and columns.
		 *  we have to at-least provide the values of rows at the time of initialization.
		 */

		
		int[][] table=new int[3][4];
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				table[i][j]=(i+1)*(j+1);
			}
		}
		
	
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
			
		{
			System.out.print(table[i][j]+" ");
		}
		System.out.println();
	}

}
}
