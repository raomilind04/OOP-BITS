package classNotes;

class Car{
	static int x = 2 ; 
	static int sum; 
	
	// static block
//	static {
//		for(int i = 0 ; i < 3 ; i++) {
//			sum += i; 
//		}
	
	// non static block
	{
		for(int i = 0 ; i < 3 ; i++) {
			sum += i; 
		}
	}
	
}

public class Feb8 {

	public static void main(String[] args) {
		
		
		
		 // GARBAGE COLLECTION
		
		
		
		
		// Java handles de-alloc using garbage collection
		// No reference to an object => Garbage
		// System.gc() , runtime.gc() -> from java lang class; => Can effect performance do not use. 
		// sporadically during program execution
		// Pakage private is the default for access specifiers
		
		// Static modifier -> For memory management
		// instance var are created when an object is created -> at different memory locations
		// Var common to all obejcts are static var
		// Static var can be used even without object declarations
		// initalization -> 
		// 1-> static var_type var_name
		// 2-> declare static block . static int x ; static { x = 2};
		// 
		
//		System.out.println(Car.x); // direcly access without object
//		System.out.println(Car.sum); 
		
		// Static block
//		Car c1 = new Car(); 
//		Car c2 = new Car(); 
//		System.out.println(Car.sum); // ans is 3 -> although two objects are created but static block is run only once 
		
		// Non Static Block
//		System.out.println(Car.sum);  // ans = 0
//		Car c1 = new Car();
//		System.out.println(Car.sum); // ans = 3
//		Car c2 = new Car();
//		System.out.println(Car.sum); // ans = 6
		
		// 
		
	}

}
