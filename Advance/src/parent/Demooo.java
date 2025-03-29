package parent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demooo {

	public static void main(String[] args) {
		
		List<String> cities=Arrays.asList("mumbai","pune","delhi","noida");
		
		//List<String> inverse=cities.stream().map(city-> ).collect(Collectors.toList());
		
//	System.out.println(inverse);
		
		
		
		cities.stream().map(city-> {
			StringBuilder sb=(String)new StringBuilder(city);
			city=sb.reverse();
			}).forEach(n->System.out.println(n));
		  
	
	
	
	}

}



