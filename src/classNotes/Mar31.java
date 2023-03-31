package classNotes;

import java.lang.reflect.Modifier;


// 		EX 1

interface autocar31{
	default void print() {
		System.out.println("print in autocar"); 
	}
}
interface Honda31 extends autocar31{
	default void print() {
		System.out.println("print in honda"); 
	}
}
//class City31 implements autocar31{
//	public void show() {
//		System.out.println("show in city"); 
//	}
//	public void print() {
//		System.out.println("print in city"); 
//	}
//}
class City31 implements autocar31 , Honda31{
	public void show() {
		System.out.println("show in city"); 
	}
	public void print() {
		System.out.println("print in city"); 
	}
}



//			EX 2

interface Honda312{
	void show(); 
	default void print() {
		System.out.println("print in honda"); 
	}
}
interface Autocar312{
	default void print() {
		System.out.println("print from autocar");
	}
	void music(); 
}

// 	MULTIPLE INHERITANCE
//class City312 implements Honda312, Autocar312{
//	public void print() {
//		System.out.println("print from city");
//	}
//	public void music() {
//		System.out.println("music from city");
//	}
//	public void show() {
//		System.out.println("show from city");
//	}
//}

//class City312 implements Honda312{
//	public void print() {
//		System.out.println("print from city");
//	}
//	public void music() {
//		System.out.println("music from city");
//	}
//	public void show() {
//		System.out.println("show from city");
//	}
//}
class City312 implements Autocar312{
	public void print() {
		System.out.println("print from city");
	}
	public void music() {
		System.out.println("music from city");
	}
	public void show() {
		System.out.println("show from city");
	}
}




public class Mar31 {
	public static void main(String[] args) {
//		City31 c1 = new City31(); 
//		c1.show(); 
//		c1.print(); 
//		autocar31 car1; 
//		car1 = c1; 
//		car1.print();
		
		
		City312 c1 = new City312(); 
		c1.print(); 
		c1.music(); 
		c1.show(); 
		
		
		
		
		
		
		
		// NESTED INTERFACES
		
		
		
		
		
		
		
		
		// 1 -> interface inside an interface :
		//			outer-> public default non static
		//						static using classname (from outter)
		//						non static using object
		//			inner-> public static
		//						static member using classname (from inner)
		//						non static directly
		
		
		// 2 -> class inside an interface :
		//			outer-> public default non static
		//			inner-> public static
		
		
		
		// 3 -> interface inside an class : 
		//			outer-> public default non static
		//			inner-> public private default protected static
		
		
			
		// Modifer.isStatic() -> import from java.lang.reflect.Modifiers
		
		
		// files generated in nested interfaces -> two classfiles -> outter.class + outter$inner.class
		
	}
}
