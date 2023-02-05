package classNotes;


class Dog{
	static int legs = 4; 
	int age ; 
}

class counter{
	// without static it prints 1 1 1
	static int counter; 
	
	counter(){
		counter++; 
		System.out.println(counter); 
	}
}

public class BeforeFeb3 {
	
	
	public static void main(String[] args) {
		
		
		// static var and non static var
		
//		Dog dog1 = new Dog(); 
//		dog1.age = 3;
//		System.out.println(dog1.legs + " " + dog1.age); 
//		Dog d2  = new Dog(); 
//		d2.legs = 3; 
//		System.out.println(d2.legs); 
		
//		counter c1 = new counter(); 
//		counter c2 = new counter(); 
//		counter c3 = new counter(); 
		
		
		// Java is strongly typed language , assign float to int will give error unlike c and c++ which are strongly typed languages.
		
//		int i ; 
//		i = 3.0 ; 
//		//gives error => Type mismatch: cannot convert from double to int
		
		
		// Java uses uni-code for chars
		// String objects are immutable
		// from java.lang.String
		// int dec = 123; 
		// int oct = 0123; 
		// int hex = 0x123;
		// int bin = 0b1011; 
		// Floating-point literals are by default double
		// To store a literal as float, we have to append F or f to the constant
		// True≠1 and False≠0
		
//		float num = 123.34 ; // Error
//		float num2 = 123.34f; 
		
//		char c  = 'B'; 
//		c++; 
//		System.out.println(c); 
//		char a = '\u0065'; // unicode representation
//		char b = 65; // ASCII representation
//		System.out.println(a); // print 'e'; 
//		System.out.println(b); // print 'A'; 
		
		
		// Strings are implemented as objects rather than an array of characters
		
//		System.out.println("Hello");
//		System.out.println();  // one empty line
//		System.out.println("World");
//		 
//		System.out.println("Hello");
//		System.out.println("\n");  // two empty line
//		System.out.println("World");
//		
//		System.out.println("Hello");
//		System.out.println(" ");  // one empty line
//		System.out.println("World");
//		
//		System.out.println("Hello");
//		String newline = System.lineSeparator(); 
//		System.out.println(newline);  // two empty line
//		System.out.println("World");
//		
//		System.out.println("Hello");
//		String newline1 = System.lineSeparator(); 
//		System.out.print(newline1);  // one empty line
//		System.out.println("World");
		
		
		// narrowing conversion has to be type casted, 
		// int i  , byte b => b = (int) i but i = b can be done directly
		
//		int a ; 
//		double d = 4.333; 
//		a = (int) d; // => type cast is important 
//		System.out.println(a); 
		
		
		// Values outside the range are auto promoted for compatible types
		// Byte and short are promoted to int
		// If one operand is long/float/double, the entire expression becomes long/float/double
		// automatic promotion only happens for byte and short type
		
//		int i = 258; 
//		byte b = (byte) i ; // => 256 is the byte range
//		System.out.println(b); // print the mod 256 value if out of range
//		
//		int i2 = 10; 
//		byte b2 = (byte) i2;
//		System.out.println(b2);
//		
//		int i3 = 254; 
//		byte b3 = (byte) i3; // in range if we consider the range from 0-256; 
//		System.out.println(b3); // print the two complement => -2
		
//		byte b = 42;
//		char c = 'a'; 					//97
//		System.out.println((int) c);
//		short s = 1024;
//		int i = 50000;
//		float f = 5.67f;
//		double d = .1234;
//		double result = (f * b) + (i / c) -(d * s);
//		System.out.println(f*b); 		// 238.14
//		System.out.println(i/c); 		//515
//		System.out.println(result); 	// 626.7784146484375
		
//		char a='A';
//		char b=66; // B
//		int i=67;
//		char c= (char) i; // C
//		System.out.println(a); 
//		a=(char)(a+1);
//		System.out.println(a); 
//		a+=1;
//		System.out.println(a); 
//		a++; 
//		System.out.println(a); 
//		System.out.println("a: "+a+" b: "+b+" c: "+c+" i: "+i); 
		
		// Arrays
		// data_type[] name or data_type name[] => only creates the reference and not the actual array itself
		// name = new data_type[size]
		// In case of primitive data types, the actual values are stored in contiguous memory locations
		// 2D arrays => rows are allowed to vary in length
		// For a multidimensional array, we only need to specify the size for the first (leftmost) dimension
		
		
		
	
//		String[][] names = { {"Mr. ", "Mrs. ", "Ms. "},{"Manish" , "Meeta"}}; 
//		System.out.println(names[0][0] + names[1][0]);
//		System.out.println(names[0][2] + names[1][1]);
		

		
	}
	
}
