package classNotes;

interface stati{
	static void m1() {
		System.out.println("Static m1");
	}
	default void m2() {
		System.out.println("default m2"); 
	}
	void m3(); 
}

class statc implements stati{
	//static void m1(); 
	//void m1(); 
	public static void m1() {
		System.out.println("m1 from class"); 
	}
	public void m2() {
		System.out.println("m2 from the class"); 
	}
	public void m3() {
		System.out.println("m3 from the class"); 
	}
}

public class Mar29 {

	// MULTIPLE INHERITANCE BY INTERFACES
	
	// class can implement multiple interfaces
	// interface extends multiple interfaces
	// class p1 and class p2 have a method m1 and a chidl class inherit both p1 and p2. Which m1 to inherit ? -> This is why multiple inheritance is not allowed. 
	// default methods can not have the same name when multiple inheritance happens.
	// if class implements the same name method from the interfaces then the method from the class is used. 
	
	
	
	
	// DEFAULT AND STATIC METHOD 
	
	
	
	
	// add new methods to the interface without breaking thier exisiting implementation. 
	// extend interface in a backward compatible/downward compatible. 
	//static methods can be declared in the interfaces but the can not be overridden by the implemenation class.
	
	public static void main(String[] args) {
		statc b = new statc(); 
		b.m3(); 
		stati.m1(); 
		b.m1(); 
		statc.m1(); 
	
		stati a = new statc(); 
		a.m2(); 
		//a.m1(); 	
	}
	
	
}
