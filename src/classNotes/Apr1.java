package classNotes;

interface Car011{
	void auto(); 
	static void m1() {
		System.out.println("m1 from the car interface"); 
	}
}

interface Hyu011{
	void type(); 
	default void show() {
		System.out.println("show from hyu interface");
	}
}

class Aura011 implements Car011 , Hyu011{
	public void auto() {
		System.out.println("auto in Aura");
//		show(); // -> not an error
//		Car011.m1(); 
//		m1();  // -> error
	}
	public void type() {
		System.out.println("type in aura");
//		show(); // -> not an error
//		Car011.m1();
//		m1(); // -> error
	}
	
	static void m1() {
		System.out.println("m2 in aura");
//		show(); // -> error
//		Car011.m1();
//		m1(); // -> error
	}
	static void m2() {
		System.out.println("m2 in aura");
//		show(); // -> error
//		Car011.m1();
//		m1(); // -> error
	}
	
}





// EXAMPLE 2






interface autocar012{
	default void print() {
		System.out.println("print in autocar");
	}
	default void show() {
		System.out.println("show in autocar");
	}
}

interface honda012 extends autocar012{
	static void m1() {
		System.out.println("m1 in honda");
	}
	default void m2() {
		System.out.println("m2 in honda");
	}
	default void print() {
		autocar012.super.print(); 
		System.out.println("print in honda");
	}
	
}

//class civic012 implements autocar012{
//	public void print() {
//		
//		//methods from the class that is being implemented can be accessed in two ways
//		
//		//honda012.super.print(); 
//		autocar012.super.print();
//		//honda012.show(); 
//		show(); 
//		
//		
//		// static member of the extending extending can be accessed uing the name of the interface. 
//		//m1(); -> error
//		honda012.m1();
//		//m2(); 
//		//honda012.m2(); 
//		System.out.println("print in civic");
//	}
//}
class civic012 implements honda012{
	public void print() {
		honda012.super.print(); 
		//autocar012.super.print();
		//honda012.show(); -> error
		show(); 
		//m1(); 
		honda012.m1();
		//honda012.m2(); 
		System.out.println("print in civic");
	}
}



public class Apr1 {
	public static void main(String[] args) {
		
		
		// EXAMPLE 1
		
//		Aura011 car1 = new Aura011(); 
//		Car011 car2 = new Aura011();
//		Hyu011 car3 = new Aura011(); 
//		car1.type(); 
//		car1.auto(); 
//		Aura011.m1(); 
//		car2.type();  // -> error (he method type() is undefined for the type Car011)
		
		
		
		
		
		
		// EXAMPLE 2
		
		
		
		civic012 c1 = new civic012(); 
		autocar012 a = new civic012(); 
		honda012 b = new civic012(); 
		
		
//		b.print();		// -> output below -> super of the extending class is also called
//		print in autocar
//		print in honda
//		show in autocar
//		m1 in honda
//		print in civic
		
		
//		c1.print(); 
//		c1.show(); 
//		a.print();   // use the print method from the civic class
		
		
		
		
		// EXAMPLE 3
	}
}
