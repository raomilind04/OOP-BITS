package classNotes;

class Bits{
	Bits(){
		System.out.println("c1"); 
	}
	Bits(boolean b){
		if(b) {
			System.out.println("c2"); 
		}else {
			System.out.println("c2 case 2"); 
		}
	}
	Bits(double x){
		System.out.println("c3"); 
	}
}

class Circle{
	double x ; 
	double y ;
	double radius; 
	
	Circle(){
		this.x = 0; 
		this.y = 0; 
		this.radius = 1; 
	}
	Circle(double radius){
		this.x = 0; 
		this.y = 0; 
		this.radius = radius; 
	}
	Circle(double x  , double y , double radius){
		this.x = x; 
		this.y = y; 
		this.radius = radius; 
	}
	
	void circum() {
		double ans = 2*3.14*this.radius; 
		System.out.println(ans); 
	}
	void area() {
		double ans = 3.14*this.radius*this.radius; 
		System.out.println(ans); 
	}
}

class Inc{
	int func(int x) {
		x++; 
		return x; 
	}
}

class V{
	int y = 15; 
	
	void func(V x) {
		x.y += 10; 
		System.out.println(x.y); 
	}
}

public class Feb13 {

	public static void main(String[] args) {
		
		
		// CONSTRUCTOR OVERLOADING
		
		
		// classes can overloaded by just like methods
//		Bits c1 = new Bits(); 
//		Bits c2 = new Bits(false); 
//		Bits c3 = new Bits(3.3); 
//		Bits c4 = new Bits(4);  // auto convert to double and call that const
			
		// Practice Question with constructor and method overloading
//		Circle c1 = new Circle(); 
//		c1.area(); 
//		c1.circum();
//		Circle c2 = new Circle(2); 
//		c2.area(); 
//		c2.circum(); 
//		Circle c3 = new Circle(1 , 0 , 3); 
//		c3.area(); 
//		c3.circum(); 
		
		
		// Argument Passing
		
		
		
		// call by value => new var with same value at different memory location
		// call by reference => shared memory
		// primative data types as passed as value
		// Objetcs call by reference
		
		
		// pass by value
//		Inc i1 = new Inc(); 
//		int y = 10; 
//		System.out.println("Before: " + y);  
//		System.out.println("After: " + y); // Same because pass by value happens for primative types
		
		// pass be reference
//		V v1 = new V(); 
//		V v2 = new V(); 
//		v1.func(v2); 
//		System.out.println("v2: " + v2.y);
//		System.out.println("v1: " + v1.y); 
		
		

	}

}
