package classNotes;

public class Apr3 {

	public static void main(String[] args) {
		
		
		
		
		
		
		//		WRAPPERS
		
		
		
		
		
		
		 
		// primitives have lesser overhead -> faster and better performace
		// java.util package handles only objects
		// wrapper encapsulates a primitive type into an object
		// same name as primitive but with first letter caps (Integer Long Float Character Double ....)
		// every wrapper except Character has overloaded constructors
		//				1-> primivte data type as args
		//				2-> string args -> format shoud be parasable number -> NumberFormatException
		// Character takes only char type
		// Float -> 3 constructors
		// eg -> Boolean(boolean b1) -> b1 should be true or false (should be in lower case)
		// when string is passed -> true => true and everything else is false (case not imp ?)
		// type wrapper overrides the to_string method of the java lang object
		// dirctly pass wrapper object to the object
		
		
//		byte p  = 10; 
//		Byte b1 = new Byte(p); 
//		//Byte b2 = new Byte(10); // -> undefined constructor
//		
//		boolean b = true; 
//		//boolean b = True;  // -> error
//		Boolean b3 = new Boolean(b); 
//		
//		float f = 20.9f;
//		Float f1 = new Float(f); 
//	
//		
//		System.out.println("Byte object : " + b1); 
//		System.out.println("Boolean : " + b3);
//		System.out.println("Float : " + f1);
		
		
		//shorter method to do the same 
		
//		Integer i1 = new Integer(10); 
//		System.out.println("integer : " + i1);
//		
//		// byte can not be converted directly
//		//Byte b1 = new Byte(10);  // -> error
//		
//		Byte b1 = new Byte((byte) 10); 
//		System.out.println("Byte object : " + b1);
//		
//		Character c1 = new Character('t'); 
//		System.out.println("Char object : " + c1); 
//		
//		Float f1 = new Float(200.9); // -> not an error because float has a double args constructor
//		System.out.println("Float object : " + f1); 
		
		
		// TYPE CONVERSIONS AND OVERFLOWS
		
		
		//auto up conversion is allowed
		
//		Integer i1 = new Integer((byte) 10); 
//		System.out.println("integer : " + i1);
//		
//		Byte b1 = new Byte((byte) 260); 
//		Byte b2 = new Byte((byte) 129); // -> 2's compliment
//		System.out.println("Byte object : " + b1);
//		System.out.println("Byte object : " + b2);
		
		
		
		
		
		
		
		
		
		
		
		// BOXING AND UNBOXING
		
		
		
		
		
		
		
		
		
		
		
		
		// primitive to object is called boxing and vice versa is called unboxing
		
		
		
		
		// Method 1 -> primitive_type name = object_name; 
		
		//wrapping
//		Integer i1 = new Integer(100); 
		//unwrapping
//		int i = i1; 
//		System.out.println("integer : " + i1);
//		System.out.println("int : " + i);
//		// byte b2 = i1; // -> error -> downconversion
//		Byte b1 = new Byte((byte) 10); 
//		i = b1; 
//		System.out.println("int : " + i);
		
		
		
		
		// 	Method 2 -> Numeric type wrapper for unwrapping
		
		// int intValue(); 
		// char charValue(); -> return the encapsulated char value
		// name.floatValue(); 
		// name.doubleValue(); 
		
		
//		Integer i1 = new Integer(100); 
//		int i = i1.intValue(); 
//		System.out.println("int : " + i);
//		// float to int conversion
//		Float f1 = new Float(200.200); 
//		i = f1.intValue(); 
//		System.out.println("int : " + i);
	
		
		
	}

}
