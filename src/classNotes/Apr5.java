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
		// Integer i1 = 100 ; i++ -> convert Int to int -> add 1 -> convert int back to Int
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
//		Boolean b = Boolean.valueOf("false"); 
//		System.out.println(b); 
		
		
		
		// Code 2  ->
//		Integer i = Integer.valueOf("1101" , 2); 
//		System.out.println(i);
//		Integer i2 = Integer.valueOf("123" , 8); 
//		System.out.println(i2); 
//		Integer i3 = Integer.valueOf("75" , 10); 
//		System.out.println(i3); 
		
		
	
		// Code 3  -> 
		Integer i = Integer.valueOf(10); 
		Double d = Double.valueOf(10.5); 
		Character c = Character.valueOf('a'); 
		
		Integer i1 = Integer.valueOf("1101" , 2); 
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		System.out.println(i1);
		
		
		
		
		
		

	}

}