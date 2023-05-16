package classNotes;

class overRidingP{
	
	int x = 2; 
	int y = 2; 
	void disp() {
		System.out.println("This is the parent class"); 
	}
	void dispNum() {
		System.out.println("x : " + x + " and " + "y : " + y); 
	}
	overRidingP(int x , int y){
		this.x = x; 
		this.y = y; 
		System.out.println("C parent"); 
	}
	overRidingP(){
		this.x = 2; 
		this.y = 2; 
		System.out.println("C parent"); 
	}
	
}

class overRidingC extends overRidingP{
	
	int x = 3; 
	int y = 3;
	
	void disp() {
		System.out.println("This is the child class"); 
	}
	void dispNum() {
		System.out.println("x : " + x + " and " + "y : " + y); 
	}
	// Method to use the methods and var from super in case of overriding
	void superDisp() {
		super.disp();
		super.dispNum();
	}
	
}

class overRidingCC extends overRidingC{
	int x = 4 ; 
	int y = 4; 
	void disp() {
		System.out.println("This is the child of child class"); 
	}
	void dispNum() {
		System.out.println("x : " + x + " and " + "y : " + y); 
	}
	// Method to use the methods and var from super in case of overriding
	void superDisp() {
		super.disp();
		super.dispNum();
	}
	// Method to get the methods super of super class
	void sSuperDisp() {
		super.superDisp();
	}
	
}

public class Feb27 {

	public static void main(String[] args) {
		
		// OVERRIDING
		
		
		// same method signature in parent and child => overriding method
		// use method defined inside the child
		// Constructor are not inherited 
		// Constructors of the parent can be used with the help of the super keyword
		
		
		overRidingP c1 = new overRidingP(); 
		overRidingC c2 = new overRidingC(); 
		overRidingCC c3 = new overRidingCC(); 
		c1.disp();
		c1.dispNum();
		System.out.println(" "); 
		c2.disp();		// use the Child disp
		c2.dispNum(); 	// hides the value of the var from the parent class; 
		c2.superDisp();
		System.out.println(" "); 
		c3.disp(); 
		c3.dispNum();
		c3.superDisp();		// use function of immediate parent
		c3.sSuperDisp();	// use functions/methods/var of the parent of parent.
		
		// use super to access the parents constructor
		// when the constructor for child is called then the explictly defined constructor of the parent is also envoked. 
	}

}
