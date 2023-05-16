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
	static void show() {
		System.out.println("show in honda"); 
	}
}
class City31 implements autocar31{
	public void show() {
		System.out.println("show in city"); 
	}
	public void print() {
		System.out.println("print in city"); 
	}
}
//class City31 implements autocar31 , Honda31{
//	public void show() {
//		System.out.println("show in city"); 
//	}
//	public void print() {
//		System.out.println("print in city"); 
//	}
//}



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
class City312 implements Honda312, Autocar312{
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
//class City312 implements Autocar312{
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


// 		EX 3

interface Honda313{
	static void display() {
		System.out.println("dispaly in honda"); 
	}
	default void show() {
		System.out.println("show in honda");
		Autocar313.print(); 
	}
	interface Autocar313{
		static void print() {
			System.out.println("print from autocar");
		}
		default void show() {
			System.out.println("show from autocar");
			display(); 
		}
	}
}

//class City313 implements Honda313.Autocar313, Honda313{
//	public void display() {
//		Honda313.display();
//		//Honda313.Autocar313.super.print(); 
//		System.out.println("display in city");
//	}
//}

//class City313 implements Honda313.Autocar313{
//	public void display() {
//		Honda313.display();
//		Honda313.Autocar313.print(); 
//		System.out.println("display in city");
//	}
//}

class City313 implements Honda313{
	public void display() {
		Honda313.display();
		//Honda313.Autocar313.super.print(); 
		System.out.println("display in city");
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
//		Honda31.show();  
		
		
		
//		City312 c1 = new City312(); 
//		c1.print(); 
//		c1.music(); 
//		c1.show(); 
		
		
		
		
		
		
		
		// NESTED INTERFACES
		
		
		
		
		
		
		
		
		// 1 -> interface inside an interface :
		//			outer-> public default non static
		//						static using classname (from outter)
		//						non static using object -> not possible
		//			inner-> public static
		//						static member directly (from inner)
		//						non static via an object -> can not create an object of interface -> can not access
		
		
		// 2 -> class inside an interface :
		//			outer-> public default non static
		//						static using the class name (className.methodName()); 
		//						non static can be accessed using an object of the nested class 
		//			inner-> public static
		//						static memeber can be accesed directly
		//						non static member can not be accessed because object can not be created. 
		
		
		// 3 -> interface inside an class : 
		//			outer-> public default non static
		//						static -> using the className
		//						non static can not be accessed
		//			inner-> public private default protected static
		//						static can be directly accessed
		//						non static using object
		
	
		// Modifer.isStatic() -> import from java.lang.reflect.Modifiers
		
		
		// files generated in nested interfaces -> two classfiles -> outter.class + outter$inner.class
		
		
//		System.out.println("Static " + Modifier.isStatic(Honda313.Autocar313.class.getModifiers())); 
//		System.out.println("Static " + Modifier.isStatic(Honda313.class.getModifiers())); 
		City313 c = new City313(); 
		c.display(); 
		//c.print(); //-> Error
//		c.show(); 
		
	}
}
