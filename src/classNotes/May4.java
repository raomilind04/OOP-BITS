package classNotes;
import java.util.*; 
import java.io.*; 
import static java.lang.Math.*; 

public class May4 {

	public static void main(String[] args) throws Exception{
		
		
		//	Code 1
//		int i; 
//		double d; 
//		boolean b; 
//		String str; 
//		FileReader fin = new FileReader("Read2.txt"); 
//		Scanner s1 = new Scanner(fin); 
//		//System.out.println(s1.nextLine()); 
//		while(s1.hasNext()) {
//			if(s1.hasNextInt()) {
//				i = s1.nextInt(); 
//				System.out.println("int : " + i); 
//			}else if(s1.hasNextDouble()) {
//				d = s1.nextDouble(); 
//				System.out.println("Double : " + d); 
//			}else if(s1.hasNextBoolean()) {
//				b = s1.nextBoolean(); 
//				System.out.println("Boolean : " + b); 
//			}else {
//				str = s1.next(); 
//				System.out.println("String : " + str); 
//			}
//		}
//		s1.close();
		
		
		
		
		
		
		
		
		
		
		// 	CONSOLE CLASS 
		
		
		
		
		
		
		
		
		
		
		// Read pass does not echo when it is used to read
		
	
		
		// Code 2 		-> Can not be run in an IDE env
//		Console con = System.console(); 
//		String str = con.readLine("Enter a String : "); 
//		con.printf("Your UserName : %s\n", str);
//		char [] pass = con.readPassword("Enter PassWord : "); 
//		String password = String.valueOf(pass); 
// 		con.printf("Your PassWord : %s\n" , password); 
		
		
		// Code 3
//		int a = 10; 
//		System.out.printf("a = %d\n", a);
//		System.out.printf("PI = %.3f\n", PI);
//		double d = 10.5; 
//		System.out.printf("a = %.4f\n", d);
//		double d1 = 12345.6; 
//		System.out.printf("a = %15.4f\n", d1);

		
		// Code 4
//		Date date = new Date(); 
//		System.out.printf("%1$tA %1$tB %1$tY %n" , date);
//		System.out.printf("%1$td.%1$tm.%1$ty %n" , date);
//		System.out.printf("%tT%n" , date); 
		
		
		
		
		
		
		
		
		// UNIFIED MODELING LANGUAGES
		
		
		
		
		
		
		
		
		
		// Types 	-> Structural UML -> Depict the structure of the systems
		//			-> Behavior UML -> info about the actors and building blocks
		// Class Diagrams -> 
		// data models -> overview of how the application is structured -> Reduce maintenances
		// Elements -> ClassName , Attributes , Methods , Relations
		
		// Relations -> 
		// 1 ->		Dependency -> Changes in defination of class 1 effects the code of class 2 but not vice vera -> Dotted lines
		// 2 -> 	Inheritance/Genralization -> Solid Arrows 	
		// 3 -> 	Association -> instance var that holds the reference to other object (has a realtionship)
		//						-> Aggregation -> Whole part ownership -> Child can exit without parent  -> line with like a blank rect ||  Composition -> Strong Ownership -> Child can not exit without the parent -> Colored block at the head
		//						-> Arrow from child to the parent
		
		// - -> private
		// # -> protected
		// + -> public 
		// ~ -> package
		
		// Sequence Diagram
		// Actor -> interacts with the systen
		// Lifeline -> Just an participant 
		// Messages ( Asycn -> ack not needed ,  Sync -> Needs an ack  , create message -> new object , delete message -> delete , self , reply , found -> msg from the unknown sourse , lost message -> target not known)
		// Guards -> control the flow of the messages
		
		
		
		
		
		
	}

}
