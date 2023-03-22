package classNotes;





interface Caar{
	void run(); 
}

class Hyn implements Caar{
	
	// by default -> pakage private -> weaker access priv => Cannot reduce the visibility of the inherited method from Caar
	// has be to public 
	public void run() {
		System.out.println("The Car is running"); 
	}
}






interface autocar{
	void print(); 
}
interface Honda1 extends autocar{
	void show(); 
}
class City1 implements Honda1{
	
	// should implement both the abstract methods
	
	public void print() {
		System.out.println("Print method"); 
	}
	public void show() {
		System.out.println("Show method"); 
	}
}






public class Mar20 {

	public static void main(String[] args) {
		
		
		
		
		//  EARLY AND LATE BINDING
		
		
		
		
		// Early Binding -> static binding -> compile time -> private , static  , final Methods -> overloaded methods
		// Late Binding -> dynamic binding -> run time -> meethod over ridding
		
		
		
		
		
		// INTERFACES
		
		
		
		
		
		// reference type in java
		// collection of abstract methods
		// Aim-> achieve 100% abstraction
		// contract for the subclass to implement
		// multiple inheritance -> one class inherits from 2 or more classes
		// abstract implicity
		// class implements interface -> implementes keyword
		// interface extends interface -> extends keyword
		// can not be instantiated
		// all mmethods are public
		// public static final- > var in interface
		// interface can only extends another interface , it can not extend an class
		
//		Hyn aura = new Hyn(); 
//		aura.run(); 
		
		
		
	}

}
