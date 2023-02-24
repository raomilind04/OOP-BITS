package classNotes;


class AA{
	int x = 1; 
	protected int temp = 10; 
	void dispA() {
		System.out.println("x in A : " + x); 
	}
}

class BB extends AA{
	int y = 2; 
	int x = 10; 	//  x in class BB and C is 10 now => hides the value of the og x variable. => VARIABLE OVERRIDING
	void dispB() {
		System.out.println("x in B : " + x); 
		System.out.println("x in B without hiding : " + super.x); 
		System.out.println("y in B : " + y); 
		System.out.println("temp in B : " + temp);
	}
}

class C extends BB{
	int z = 3; 
	void dispC() {
		System.out.println("x in C : " + x); 
		System.out.println("y in C : " + y);
		System.out.println("z int C : " + z); 
		System.out.println("temp in B : " + temp);
	}
	
}
public class Feb24 {

	public static void main(String[] args) {
		
		
		
		// INHERITANCE
		
		
		
		// Sub class / extended class / child class derived from super class / base class / parent class. 
		// All classes are subclass of the class object (When superclass is not explicitly mentioned). 
		// Inherit all members of the superclass -> methods , nested classes , feild.
		// Constructors are not inherited by the subclass , but can be invoked from the sub class. 
		// Inherit all public and protected members no matter what pakage the subclass is in. 
		// Same pakage => inherit the pakage-private members. 
		// Never inherit the private methods of its parent. 
		// Redeclatation of feild is allowed (ie. int x in subclass inheriting from the superclass with a public int x)
		
		
		AA a = new AA(); 
		BB b = new BB(); 
		C c = new C(); 
		a.dispA();
		b.dispB();
		c.dispC();
		System.out.println("DispA classed from object of class C"); 
		c.dispA();
		
		// super keywords to access the feilds and methods of the parent when overriding occurs in the subclas. 
		// 
		
	}

}
