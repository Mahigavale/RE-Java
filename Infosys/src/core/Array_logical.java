package core;

public class Array_logical {

	public static void main(String[] args) {
		
		int [] arr= { 0,1,2,1,2,0,0};
		
		int index= arr.length-1;
		
		for(int i=index; i>=0;i--)
		{
			if(arr[i] !=0)
			{
				arr[index]=arr[i];
			}
			index--;
		}

		
		 for(int i:arr)
		 {
			 System.out.println(i);
		 }
	}

}
