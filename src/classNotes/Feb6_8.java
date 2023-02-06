package classNotes;

class M{
	private int air; 
	private double mil; 
	
	// GETTER AND SETTER
	// if method was private then calling this in main throws an error
	void dis(){
		System.out.println(air); 
		System.out.println(mil); 
		return ; 
	}
	void uAir(int newAir) {
		air = newAir; 
	}
	void uMil(double newMil) {
		mil = newMil; 
	}
	void uBoth(int newAir , double newMil) {
		air = newAir; 
		mil = newMil; 
	} 
	
	// Constructor
	// Called only once
	M(){
		this.air = 1; 
		this.mil = 12.5; 
	}
	// parameters passed using a different name => no need to use this keyword
	// replace this with obj => by object handler
	// instance var on the right (with this keyword)  , local var on the right
	// this.air becomes obj.air 
	// if we do not use the this keyword then we do not get an error we return the value used at the time of declaration of the var
	M(int air , double mil){
		this.air = air; 
		this.mil = mil; 
	}
	
}

public class Feb6_8 {
		
	public static void main(String[] args) {
		
		// CODE 1 methods
		M car1 = new M(); 
		car1.dis();
		car1.uAir(3);
		car1.uMil(14.5); 
		car1.dis(); 
		car1.uBoth(7 , 15);
		car1.dis(); 
		M car2 = new M(10 , 20.5); 
		car2.dis(); 
		return ; 
		
		// Getters and setter help us get access to private members of other classes
		// constructor has the same name as class name , initialize the initial state of the object 
		// constructor has no return type
		// default constructor is created by java if we do not define	
		
	}
}
