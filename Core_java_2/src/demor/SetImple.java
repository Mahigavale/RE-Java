package demor;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		TreeSet<Integer> set1=new TreeSet<>(new Comparator<Integer>() {
			
			public int compare(Integer i,Integer j)
			
			{
				return Integer.compare(j,i);
				
			}
		});
		
		set1.add(10);
		set1.add(20);
		set1.add(7);
		set1.add(13);
		
		
		Iterator<Integer> itr= set1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//ListIterator<Integer> it2=set1.iterator();
		
		//set does not provide for the ListIterator as it is not index based.
		
	}

}
