package classNotes;
import java.io.*; 

public class May1 {

	public static void main(String[] args) throws Exception{
		
		
		
		
		
		
		
		
		//		STRINGS
		
		
		
		
		
		
		
		
		
		
		//		Code 1
//		// same hashcode
//		String s1  = "Hello"; 
//		String s2 = "Hello"; 
//		System.out.println(System.identityHashCode(s1)); 
//		System.out.println(System.identityHashCode(s2));
//		// different hashcode when we use the new keyword
//		String s3  = new String("Hello"); 
//		String s4 = new String("Hello"); 
//		System.out.println(System.identityHashCode(s3)); 
//		System.out.println(System.identityHashCode(s4));
		
		
		//		Code 2
		
		// concat method
//		String s1 = "Hello"; 
//		String s2 = "Hello"; 
//		String s3 = s1.concat(s2); 
//		System.out.println(s3); 
//		
//		// Substring Method
//		String s4 = "hello"; 
//		String s5 = s4.substring(2); // -> Start Index 
//		System.out.println(s5); 
//		
//		// Char at method
//		String s6 = "Hello"; 
//		char temp = s6.charAt(4); // -> Index out of bounds error if index is too large
//		System.out.println(temp); 
//		
//		// Index of method
//		String s7 = "Hello hi dog cat cat cat dog"; 
//		int startIndex = s7.indexOf("dog"); 
//		System.out.println(startIndex); 
//		int startIndex2 = s7.indexOf("dog" , 12);  // -> Start after the 12th index 
//		System.out.println(startIndex2); 
//		
//		// isEmpty | Length | Equals
//		String s8  = "Hello"; 
//		String s9 = "hi"; 
//		String s10 = ""; 
//		String s11 = new String("Hello"); 
//		System.out.println(s8.length());
//		System.out.println(s10.isEmpty());
//		System.out.println(s8.equals(s9));
//		System.out.println(s8 == s9); 
//		System.out.println(s8 == s11);  
		// Double equals compares the reference of the string
		
		
		
		
		
		
		
		
		
		
		
		
		//		I/O OPERATION
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	Stream -> Abstraction that either produces or consumes information. 
		// File / Console / Network socket -> input sources
		// Same I/O for all kind of input formats
		// Types -> 
		//		1-> Byte Stream -> 8 bits at a time 
		//		2-> Char stream -> input and output are char -> UNICODE(16 bit)
		// Import java.io
		// 4 ABSTRACT CLASSES ->
		// 		1-> Input stream
		//      2-> Output stream
		//		3-> Reader
		//		4-> Writer
		// Use 1 , 2 for byte devices and 3, 4 for the char devices
		
		
		// Code 1
		FileInputStream fr = new FileInputStream("Read1.txt");
		int i; 
		while((i=fr.read()) != -1) {
			System.out.println((char) i); 
		}
		fr.close(); 
		
		
		
		
		
		
		
		
		

	}

}
