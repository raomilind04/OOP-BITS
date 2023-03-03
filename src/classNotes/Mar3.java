package classNotes;

class Parent{
	
	int x = 2; 
	
	// override is not allowed in the case of static methods. 
	// If both parent and child have static methods => will not throw an error. 
	// 
	static void display() {
		System.out.println("Parent");
	}
	void display2() {
		System.out.println("Display 2 for Parent"); 
	}
	
}

class Child extends Parent{
		int x = 4;
		
		// @ Override
		static void display() {
			// super is not allowed when use static methods
			// This keyword is also not allowed with static keywords. 
			
//			super.display();
			System.out.println("Child"); 
		}
		void display3() {
			System.out.println("Display 3 for Child"); 
		}
}

public class Mar3 {

	public static void main(String[] args) {
		
		
		// @Override => if the method is not overriden then an error is returned.
		// only methods can be over riden. 
		
		Parent p = new Parent(); 
		Child c = new Child(); 
		
		System.out.println(p.x);  // 2
		System.out.println(c.x);  // 4
		
		c.display();
		c.display2();
		p.display();
		// p.display3();	// ERROR -> Can not access child methods from parents. 
		
		
	}

}
