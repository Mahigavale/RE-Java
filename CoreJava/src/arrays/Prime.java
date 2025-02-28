package arrays;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 13, 34, 67, 43, 22, 34 ,142,31,81,80};
		
		
		
	   for(int v:arr)
	   {
		   boolean flag=true; //true
		   for(int j=2;j<v;j++)
		   {
			   if(v%j==0)
			   {
				   flag=false;
				   break;
			   }
			  
		   }
		   if(flag==true)
		   {
			   System.out.println("prime :"+v);
		   }
		   
	   }


	}

}
