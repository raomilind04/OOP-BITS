package classNotes;
import java.io.*; 

public class May1 {

	public static void main(String[] args) throws Exception {
		
		
		
		
		
		
		
		
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
		
		
		// Code 1 		=> ADD THOWS Exception/IOException TO THE MAIN
//		FileInputStream fr = new FileInputStream("Read1.txt");
//		int i; 
//		while((i=fr.read()) != -1) {
//			System.out.println((char)i); 
//		}
//		fr.close(); 
//		
		// FileNotFoundExcetion is the subclass of IOException
		// In write if file already exits then its over written
		// read can throw an IOException
		// close() -> close the file and release all the associated resources. 
		// throws Exception is important at the end of the main -> Exception always needs to be handled -> Unreported exception -> Use try and catch or the throws keyword. 
		// throws keyword raises an exception at runtime.  -> Runtime exception
		
		
		//		Code 2
//		int i; 
//		FileInputStream fr; 
//		try {
//			fr = new FileInputStream("Read2.txt"); 
//		}catch(FileNotFoundException e) {
//			System.out.println("Unable to open the file"); 
//			return ; 
//		}
//		try {
//			while((i = fr.read()) != -1) {
//				System.out.println((char) i); 
//			}
//			fr.close(); 
//		}catch(IOException e) {
//			System.out.println("Unable to read the file"); 
//			return ; 
//		}
//		System.out.println("End of code 2"); 
		
		
		// 		Code 3 : Same as previous but take file name as user cmd line argument
//		int i; 
//		FileInputStream fr; 
//		if(args.length != 1) {
//			System.out.println("No file name");
//			return ; 
//		}
//		try {
//			fr = new FileInputStream(args[0]); 
//		}catch(FileNotFoundException e) {
//			System.out.println("File not found"); 
//			return ; 
//		}
//		try {
//			while((i = fr.read()) != -1) {
//				System.out.print((char) i); 
//			}
//			System.out.println(); 
//		}catch(IOException e) {
//			System.out.println("Unable to read the file"); 
//			return ; 
//		}
//		try {
//			fr.close(); 
//		}catch(IOException e) {
//			System.out.println("Error in closing the file");
//		}
//		System.out.println("End of code 3"); 
		
		
		
		// try-with-resources 
		// ARM -> Automatic Resourse Managemnt
		// try(resourse-specificaton) {....}
		// more than one resource using semi colons
		
		
		//	Code 4  -> Try for resources
//		int i;
//		if(args.length != 1) {
//			System.out.println("No file name");
//			return ; 
//		}
//		try(FileInputStream fr = new FileInputStream(args[0])){
//			while((i = fr.read()) != -1) {
//				System.out.print((char) i); 
//			}
//		}catch(FileNotFoundException e) {
//			System.out.println("File not found"); 
//			return ; 
//		}catch(IOException e) {
//			System.out.println("Unable to read the file"); 
//			return ; 
//		}
//		System.out.println("End of code 3"); 
		
		
		// 	Code 5 
//		FileInputStream f1; 
//		FileOutputStream f2; 
//		f1 = new FileInputStream("Read1.txt"); 
//		f2 = new FileOutputStream("Code5May1.txt"); 
//		int c;
//		while((c=f1.read()) != -1) {
//			f2.write(c);
//		}
//		f1.close(); 
//		f2.close(); 
//		System.out.println("Code 5 End"); 
		
		
		
		// Code 6
		// Same as Code 5 get the src file and dest file from the user.
//		int i ; 
//		if(args.length != 2) {
//			System.out.println("File Name Missing"); 
//			return ; 
//		}
//		try(FileInputStream f1 = new FileInputStream(args[0]) ; FileOutputStream f2 = new FileOutputStream(args[1])){
//			do {
//				i = f1.read(); 
//				if(i != -1) {
//					f2.write(i);
//				}
//			}while(i != -1); 
//		}catch(IOException e) {
//			System.out.println("Error"); 
//		}
//		System.out.println("End of code"); 
		
		
		// Code 7
//		FileReader fr = new FileReader("Read1.txt"); 
//		int i; 
//		while((i = fr.read()) != -1) {
//			System.out.print((char) i); 
//		}
//		fr.close(); 
		
		
		// Code 8
//		FileReader f1; 
//		FileWriter f2; 
//		FileInputStream f3; 
//		FileOutputStream f4; 
//		
//		// Char stream does not support image file -> Distorted image. 
//		// Reader and Writer are good only for txt files 
//		// Input and output stream work perfectly with image data etc
//		
//		f1 = new FileReader("name.jpg"); 
//		f2 = new FileWriter("name2.jpg"); 
//		f3 = new FileInputStream("name.jpg"); 
//		f4 = new FileOutputStream("name2.jpg"); 
//		
//		int c;
//		// Will not copy properly
//		while((c=f3.read()) != -1) {
//			f4.write(c);
//		}
//		// will copy properly
//		while((c=f3.read()) != -1) {
//			f4.write(c);
//		}
		
		
		// BufferedInputStream -> More effiecint -> Reduce OS overhead.] -> Pass the fileInputStream as an arguement to the BufferedInputStream object. 
		
		// Method of BufferedInputStream
		//			1-> read(destination , offset , length)
		//			2-> avaliable(); 
		// 			3-> close(); 
		
		
		//		Code 9
//		FileInputStream fin = new FileInputStream("Read1.txt"); 
//		BufferedInputStream bin = new BufferedInputStream(fin); 
//		System.out.println("Remaining Bytes : " + bin.available()); 
//		System.out.println("Content : ");
//		int ch; 
//		byte[] b = new byte[200]; 
//		ch = bin.read(b , 5 , 10); 
//		for(int i = 0 ; i < b.length ; i++) {
//			System.out.print((char) b[i]);  // -> Should print empty and blank spaces also -> Not working
//		}
//		System.out.println(); 
//		System.out.println("Remaining Bytes : " + bin.available()); 
//		fin.close(); 
		
		
		// Code 10
//		FileInputStream fin = new FileInputStream("Read1.txt"); 
//		BufferedInputStream bin = new BufferedInputStream(fin); 
//		System.out.println("Remaining Bytes : " + bin.available()); 
//		System.out.println("Content : ");
//		int ch; 
//		byte[] b = new byte[200]; 
//		while((ch = bin.read()) != -1){
//			System.out.print((char) ch); 
//		}
//		System.out.println(); 
//		System.out.println("Remaining Bytes : " + bin.available()); 
//		fin.close(); 
		
		
		
		
		
		
		
		//System.out is the standard output stream -> Object of printStream
		// System.err -> Standard error stream
		// System.in -> Standard input Stream. 
		
		
		
		
		

	}

}
