package classNotes;
import java.io.*;
import java.util.*;


public class May3 {

	public static void main(String[] args) throws Exception{
		
		
		
		   
		
		
		
		
		
		
		
		//	SYSTEM CLASS
		
		
		
		
		
		
		
		
		
		
		
		
		//	Code 1 -> 
//		InputStreamReader br = new InputStreamReader(System.in); 
//		System.out.println("Enter an char : "); 
//		char c; 
//		int a ;
//		c = (char) br.read(); 
//		//a = br.read();
// 		while(c != 'x') {
//			//System.out.println(a);
// 			if(c != '\n') {
// 				System.out.println(c);
// 			}
//			c = (char) br.read();
//			//a = br.read(); 
//		}
		
		
		// Code 2
//		String s; 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		System.out.println("stop to stop");
//		s = br.readLine(); 
//		while(!s.equals("stop")) {
//			System.out.println(s);
//			s = br.readLine(); 
//		}
		
		
		// Code 3
//		File file = new File("Read1.txt"); 
//		BufferedReader br = new BufferedReader(new FileReader(file)); 
//		String s; 
//		s = br.readLine(); 
//		System.out.println(s);
////		while((s = br.readLine()) != null) {
////			System.out.println(s);
////		}
		
		
		// Code 4 -> Write has to be used with the print otherwise it prints nothing
//		System.out.write(111);
//		System.out.write(111);
//		System.out.write('p');
//		System.out.write('s');
//		System.out.println(); 
//		System.out.println("hello"); 
	
		// Code 5
//		OutputStreamWriter w = new OutputStreamWriter(System.out); 
//		w.write("hello");
//		w.close(); 
//		
		
		// Code 6
//		System.out.write("abc");
//		System.out.write(120);
//		System.out.write('\n');
//		System.out.print(args[0]);
		
		
		
		
		
		
		
		
		
		
		
		// 	SCANNER CLASS
		
		
		
		
		
		
		
		
		
		
		// hasNext Methods -> hasNext() , hasNextInt() , hasNextBool()
		// check using the hasNextX metod and then get by using the nextX method. 
		
	
		// Code 1
//		String s1 = "hello1 hello2 \nhello3 hello4\n hello5"; 
//		Scanner scan = new Scanner(s1);
//		System.out.println(scan.nextLine());
//		System.out.println(scan.nextLine());
//		scan.close(); 
		
		
		// Code 2
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s1.nextLine(); 
		System.out.println("Your Name : " + name);
		
		
		// Code 3
//		Scanner s1 = new Scanner(System.in); 
//		// System.out.println(s1); 
//		int num , mean; 
//		int sum = 0; 
//		int count = 0; 
//		while(s1.hasNextInt()) {
//			num = s1.nextInt(); 
//			sum += num; 
//			count++; 
//			mean = sum/count; 
//			System.out.println("Sum : " + sum);
//			System.out.println("Mean : " + mean);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
