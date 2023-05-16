package classNotes;

public class Apr5 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		// AUTOBOX AND AUTOUNBOX
		
		
		
		
		
		
		
//		// Auto box->
//		Integer i1 = new Integer(10); 
//		Integer i3 = 10;
//		// Autounbox -> 
//		int i2 = i1; 
//		int i4 = i3; 
//		System.out.println(i2); 
//		System.out.println(i4); 
		
		// Autobox does not support the conversion of string into int
		//Integer i1 = "2";  // -> Error : Type mismatch: cannot convert from String to Integer
		
		
		// autoboxing occours when an argument is passed to a method or when a value is returned. 
		// Integer i1 = 100 ; i1++ -> convert Int to int -> add 1 -> convert int back to Int
		// Math operation can not be performed on objects -> convert to primitive types
		// Integer + Double => autobox and then auto rebox
		// object and primitive data types can not be directly compared -> convert in the case of switch statements
		
		
		
		
		
		
		
		
		// UTILITY METHODS
		
		
		
		
		
		
		
		
		// ValueOf() method -> String to object
		// Parse method -> String to primitive
		
		// 1-> Wrapper valueOf(String s)
		// 2-> Wrapper valueOf(String s , int radix) -> radix between 2 to 36
		// 3-> Wrapper valueOf(primitive p)
		
		
		
		// Code 1  -> 
		
//		Integer i = Integer.valueOf("25"); 
//		int i2 = Integer.valueOf("10"); 
//		//Integer i3 = Integer.valueOf("adfasf"); -> Error
//		System.out.println(i);
//		System.out.println(i2);
//		
//		Double d1 = Double.valueOf(25.232343); 
//		Double d2 = Double.valueOf("25.232343"); 
//		System.out.println(d1);
//		System.out.println(d2); 
//		
//		Boolean b = Boolean.valueOf("True"); 
//		System.out.println(b); 
		
		
		
		// Code 2  ->
		
//		Integer i = Integer.valueOf("1101" , 2); 
//		System.out.println(i);
//		Integer i2 = Integer.valueOf("123" , 8); 
//		System.out.println(i2); 
//		Integer i3 = Integer.valueOf("75" , 10); 
//		System.out.println(i3); 
		
		
	
		// Code 3  -> 
		
//		Integer i = Integer.valueOf(10); 
//		Double d = Double.valueOf(10.5); 
//		Character c = Character.valueOf('a'); 
//		
//		Integer i1 = Integer.valueOf("1101" , 2); 
//		System.out.println(i);
//		System.out.println(d);
//		System.out.println(c);
//		System.out.println(i1);
//		
//		int x = Integer.parseInt("2"); 
//		int y = Integer.parseInt("1101" , 2); 
//		Double d2 = Double.valueOf("314159E-5");
//		//Double d3 = "314159E-5"; -> Can not convert String to Double. 
//		// Double d3  = Double.valueOf("1101" , 2); -> ERROR -> The method valueOf(String) in the type Double is not applicable for the arguments (String, int); 
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(d2);
		
//		Integer x1 , x2; 
//		x1 = 100; // Autoboxing
//		++x1;     // Auto-unboxing and then reboxing
//		x2 = x1+(x1/3); 
//		System.out.println(x2);
	
//		Boolean b = Boolean.valueOf("true 123");  // -> anything other than "true" will return false
//		Boolean b1 = Boolean.valueOf("true"); 
//		System.out.println(b);
//		System.out.println(b1);
		
		
		
		// Code 4  -> 
		
//		boolean b = Boolean.parseBoolean("false"); 
//		double d1 = Double.parseDouble("28.7"); 
//		int i1 = Integer.parseInt("25"); 
//		//Integer i2 = Integer.valueOf("123" , 0);  // ERROR -> radix can not be less than 2
//		System.out.println(b);
//		System.out.println(i1);
		
		Integer i = Integer.parseInt("123" , 8); 
		//Integer c = Byte.parseByte("76" , 3); // Error -> Type mismatch: cannot convert from byte to Integer
//		double d = Long.parseLong("1111" , 3); 
//		// A -> 10; 
//		int i2 = Integer.parseInt("abcd" , 16); 
//		System.out.println(i);
//		System.out.println(d);
//		System.out.println(i2);
		
		
		
		
	}

}
