package datatypes;

public class Wrapper {

	public static void main(String[] args) {
	
		/**
		 * 
		 * Wrapper classes are a way to convert the primitive data types into the Objects.
		 * 
		 * there are some compulsions where we need to provide the Objects only.
		 * 
		 * like list interfaces.
		 * 
		 */

		
		
		
		int num1=10;
		
		Integer num2=100;
		
		
		System.out.println(num1);  //can't use the get class method here. Primitive.
		
		System.out.println(num2.getClass()); //use the method here. Non-primitive.
		
		
		System.out.println(num1==num2);

		System.out.println(num2.equals(num1));
		
		
		System.out.println("using the intValue(): Method :");
		
		System.out.println(num2.intValue());
		
		
		String str=num2.toString();
		
		System.out.println(str.length());
		
	}
	
	

}
