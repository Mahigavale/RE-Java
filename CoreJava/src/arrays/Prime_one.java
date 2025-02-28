package arrays;

import java.util.Scanner;

public class Prime_one {

	public static void main(String args[])
	{
		
		int num=13;
		
		boolean flag=true;
		
		for(int n=2;n<num;n++)
		{
			if(num%n==0)
			{
				flag=false;
			}
			
		}
		
		Scanner scan=new Scanner(System.in);
		
		String fullname=scan.nextLine();
		
		
		 char[] chars=new char[fullname.length()];
		 
		 for(int i=0;i<chars.length;i++)
		 {
			 chars[i]=fullname.charAt(i);
		 }
		
		 for(char c:chars)
		 {
			 System.out.println(c);
		 }
		
		 for(int i=0;i<chars.length;i++)
		 {
			 if(i==0 || chars[i]=" ")
			 {
				 
			 }
		 }
	        
		
	}
	
}
