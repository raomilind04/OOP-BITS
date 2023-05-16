package classNotes;


// STATIC NESTED CLASS

class outterClass{
	private static int w = 1; 
	private int x = 2; 
	static int y = 3; 
	int z = 4; 
	
	public void disp() {
		// Static members can be directly accessed by using the name of the innerClass
		
		//System.out.println(w1); 		// gives error
		System.out.println(innerClass.w1) ;   	// retuns 11
		 
		// To access the non static var from the inner class in the outter class => create an object of the inner class
		
		outterClass.innerClass ob = new outterClass.innerClass(); 
		System.out.println(ob.x1); 
	}
	
	static class innerClass{
		private static int w1 = 11; 
		private int x1 = 21; 
		static int y1 = 31; 
		int z1 = 41;  
		public void disp() {
			
			// Static memebers of the outter class can be directly accessed
			System.out.println(w);
			 
			// Create an object to access the non static members
			
			outterClass ob = new outterClass(); 
			System.out.println(ob.x); 
		}
	}
	
}


// NESTED NON STATIC CLASSES


class A{
	private static int w = 1; 
	private int x = 2; 
	static int y = 3; 
	int z = 4; 
	
	// static var can accessed in the outter class using the classname but we need create an object to access the non static members
	
	void disp() {
		System.out.println(B.x1); 
	}
	
	class B{
		
		// Both the static and non static members of the outter class can be directly accessed
		// Static members of the outter class can not be accessed in a static block inside the non static inner class; 
		
		static int x1 = 100; 
		
		void inc() {
			x1++; 
		}
		
		void disp() {
			System.out.println(w); 
			System.out.println(x); 
			System.out.println("x1 : " + x1); 
		}
	}
	
}
public class Feb22 {
	 public static void main(String[] args) {
		 
		 
		 
		 
		 // STATIC NESTED CLASS
		 
		 
		 
		 
		 
//		 outterClass ob1 = new outterClass(); 
//		 outterClass.innerClass ob2 = new outterClass.innerClass(); 
//		 ob1.disp();
//		 ob2.disp(); 
		 
		 
		 
		 
		 
		 // NON STATIC NESTED CLASSES
		 
		 
		 
		 
		 
		 A ob1 = new A(); 
		 A.B ob2 = ob1.new B(); 
		 
		 // Object creation for inner class
		 		// outterClass outterObject = new outterClass(); 
		 		// outterClass.innerClass innerObject  = new outterObject.new innerClass(); 
		 
		 // An object of a Non-static inner class is associated with an instance/object of its Outer Class (ie enclosing class)
		 //The entire body of a Non-static inner class is Not within a static scope, and therefore you can't have static members
		 
		 A ob3 = new A(); 
		 A.B ob4 = ob3. new B(); 
		 ob1.disp();
		 ob2.inc(); 
		 ob2.disp();
		 ob4.disp();
		 
		 
		 ob1.disp(); 
		 ob2.disp(); 
	 }

}
