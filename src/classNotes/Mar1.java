package classNotes;

class Parent1{
	Parent1(){
		System.out.println("Parent"); 
	}
	Parent1(int x){
		System.out.println("Parent : " + x);
//		System.out.println("x : " + x); 
	}
}

class Child1 extends Parent1{
	// If child has no constructor the parent constructor is used. 
	Child1(){
		super(10);  // use the constructor for the parent (immediate parent); 
		System.out.println("Child"); 
	}
	// Super keyword is required only for parameterised constructor. 
//	Child1(int x){
//		super(x); 
//	}
	Child1(int x){
		super(x); 
		System.out.println("Child1 : " + x); 
	}
}

class Child2 extends Child1{
	
	Child2(){
		System.out.println("Child of Child"); 
	}
	
	Child2(int x){
		super(x); 
		System.out.println("Child2 : " + x); 
	}
}

public class Mar1 {

	public static void main(String[] args) {
		
		
		
		// CONSTRUCTOR INHERITANCE
		
		
		
		
		
		// Constructors of all super class are called when the the child class is intialised. 
		
		Child1 c = new Child1(20); 	// Calls the Parent constructor of the parent before the child
		// Child1 c = new Child1(); 
		
		// Use super(x) to pass variables to the parent; 
		Child2 c2 = new Child2(15); 
		// output- > 	//Parent : 15
						//Child1 : 15
						//Child2 : 15
		
		// Class with final keyword can not be inherited. 
		// If methods have the final keyword then its not possible to have method overloading; 
		// Hierarchical inheritance => One class extented by multiple classes. 
		
	}

}
