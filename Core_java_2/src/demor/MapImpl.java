package demor;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {
	
		
		Map<Integer,String> map1=new TreeMap<Integer,String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2,o1);
			}
			
		});
		
		//hashtable dosen't allow null key .
		//hashtable is same like the hash map but with the only difference is it is synchronized.
		
		map1.put(1,"dada");
		
		map1.put(2,"mama");
		
		map1.put(3, "kaka");
		map1.put(3, "shishi");
		
		
		System.out.println(map1);
		
		for(Entry<Integer, String> m:map1.entrySet())
		{
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
//		for(int i : map1.keySet())
//		{
//			System.out.println(i);
//		}
//		
//		for(String s:map1.values())
//		{
//			System.out.println(s);
//		}
	}

}
