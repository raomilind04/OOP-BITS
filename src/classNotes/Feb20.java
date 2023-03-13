package classNotes;

class B {
	private static int w = 1; 
	private int x = 2; 
	static int y = 3;
	int z = 10; 
	
	public void display() {
		System.out.println("Outter Class"); 
		System.out.println("w: " + w);
		System.out.println("x: " + x); 
	}
	
	static class B1{
		@SuppressWarnings("static-access")
		public void display() {
			
			
			// Access outter class Vars : 
			
			// inner class has direct access to static members
			// access non static members using objects; 
			
			B oob = new B(); 
			
			
			System.out.println("Inner Class"); 
			System.out.println("w: " + w); 
			System.out.println("x: " + oob.x);
			// This gives an warning
			oob.w = 33; 	//print 33 for both inner and outter class
			oob.x = 10; 
			System.out.println("w: " + oob.w); 
			System.out.println("x: " + oob.x); 
		}
	}
}

public class Feb20 {

	public static void main(String[] args) {
		
		
		//NESTED CLASSES
		
		
		
		//increases encapsulation
		// Types : 
		// 		1. Non static => inner class
		//		2. Static => static nested class
		// enclosing class , embedding class => outter class

		B ob1 = new B(); 
		B.B1 ob2 = new B.B1(); 
		ob1.display();
		ob2.display();
		ob1.display();
		
		// ob1 can not access w and x (Private)
		// inner class has direct access to static members
		// in static methods non static members can only be accessed using an object
		// 

	}

}
