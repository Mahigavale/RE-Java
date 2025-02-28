package Misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	 public static void main (String args[])
	 
	 {
		 
		 List<Integer> list =new ArrayList();
		 
		 list.add(12);
		 list.add(34);
		 
		 Iterator<Integer> itr= list.iterator();
		 
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	 }
}
