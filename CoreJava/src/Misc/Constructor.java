package Misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Constructor {

	public static void main(String[] args) {
	
//		Demo2 d=new Demo2(4);
//		System.out.println(d);
//		
		/**
		 * if we declare the constructor as Private 
		 * then it is not visible.
		 * you can change it back to the default / Package.
		 */
		

 List<Integer> list =new ArrayList();
		 
		 list.add(12);
		 list.add(34);
		
		 
		 Iterator<Integer> itr= list.iterator();
		 
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 System.out.println("vector ::::::::::::::::::::::");
		 
		 Vector<Integer> vtr=new Vector();
		 
		 vtr.add(34);
		 vtr.addFirst(33);
		 vtr.addLast(35);
		 
		 
		 for(int i: vtr)
		 {
			 System.out.println(i);
		 }
		 
	
		 
		 
		 
		 List<Object> list2=new ArrayList();
		 
		 list2.add(new String ("Mahesh"));
		 
		 list2.add(new StringBuffer("dada"));
		 
		 list2.add(56);
		 
		 list2.add(new Integer(67));
		 
		 System.out.println("Object List :::");
		 
		 for(Object o: list2)
		 {
			 System.out.println(o);
		 }
		 
		 
		 
		 System.out.println("linked List ::::::::::::");
		 
		 List<Integer> linked= new LinkedList();
		 
		 linked.add(10);
		 
		 linked.add(12);
		 
		 linked.add(14);
		 
		 
		// System.out.println(linked[0]);
		 
		 for(int i: linked)
		 {
			 System.out.println(i);
		 }
		 
		 
		 Set<Integer> set=new HashSet<Integer>();
		 
		 set.add(1);
		 set.add(1);
		 
		 for(int i:set)
		 {
			 System.out.println(i);
		 }
	}
	

}
//
//class Demo34{
//	
//	// int j;
//	protected Demo34()
//	{
//		
//		System.out.println("A");
//	}
//	
//	public Demo34(int i)
//	{     this();
//		
//		System.out.println("B");
//	}
//	
//}
//
//
//
//class Demo2 extends Demo34{
//	int j;
//	
//	public Demo2(int i)
//	{
//		super (i);
//		j=78;
//		System.out.println("C");
//		System.out.println("instacne variable intialized :"+ j);
//	}
//	
//	
//}