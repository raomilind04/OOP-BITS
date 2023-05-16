package classNotes;


class Clone1{
	int x; 
	int y; 
}

class Clone2 implements Cloneable {
	int a;
    int b;
    Clone1 c = new Clone1(); 
    public Object clone() throws CloneNotSupportedException {
    	return super.clone(); 
    }
}


class Class1{
	
	String name ;
	int age ; 
	
	Class1(String name , int age){
		this.name = name; 
		this.age = age; 
	}
	
	void clone(Class2 c2) {
		c2.name = this.name; 
		c2.age = this.age; 
	}
}

class Class2{
	String name; 
	int age ;
}

class Class3{
	int sum(int ...a) {
		int temp = 0; 
		int n = a.length; 
		for(int i = 0 ; i < n ; i++) {
			temp += a[i]; 
		}
		return temp; 
	}
}


public class Feb15_17 {

	public static void main(String[] args) {
		
		
		
		// CLONE CLASS
		
		
		
		
		
		// Assignment operator will create a copy of variables and not of objects.
		// Method to copy objects
		//		1-> By using constructor
		// 		2-> By assigning the value of one object to another
		//		3-> By clone() method of Object class
		// Classname name1 = name2; => creates an reference to name2 class which means they point to the same address. any changes in name1 are also refelected in name2
		// Every class that implements clone() should call super.clone() to obtain the cloned object reference.
	
		
		
		// Cloning a class
		
		// 1-> writing a custom clone method in class
//		Class1 c1 = new Class1("Anita" , 40); 
//		System.out.println(c1.name + " " + c1.age); 
//		Class2 c2 = new Class2(); 
//		System.out.println(c2.name + " " + c2.age); 
//		c1.clone(c2);
//		System.out.println(c2.name + " " + c2.age); 
		
		
		
		
		
		
		// FINAL KEYWORD
		
		
		
		
		
		// Used to create constant variables , Used to prevent method overriding , Used to prevent extending classes; 
		// When a variable is declared with final keyword, it’s value cannot be modified => const
		// The final variable has to be initialized otherwise the it java will throw a compile-time error.
		// A final variable cannot be re-assigned, but in case of a reference final variable, internal state of the object pointed by that reference variable can be changed.
		// A final variable cannot be reassigned, doing it, will throw compile-time error.
		// Blank initialization of final variables is allowed
		
		
		
		// Final keyword
//		final int age = 10; 
//		System.out.println(age); 
//		//age = 20; 		// The final local variable age cannot be assigned. It must be blank and not using a compound assignment
		
//		final int num[] = {1 , 2 , 3 , 4 , 5};
//		System.out.println(num[1]);
//		num[1] = 10;		// allowed
//		System.out.println(num[1]);
		
		
		// final class can not be inherited
		// creates an immutable class like the predefined String class.
		
		
		
		
		
		
		// COMMAND LINE AND VARIABLE LENGTH ARGUMENTS
		
		
		
		
		
		//  java class_name command_line_arguments
		//  JVM wraps the command-line arguments and supplies to args [] => args.length to get the length
		// A method that takes a variable number of arguments is a varargs method
		// (int ...a) => 3 dots => method can be called with zero or more args
		// var x is implicitly declared as an array of type int[]
		// only one varargs parameter can exit in a method => always at the end. 
		// Var args methods can be overloaded just like normal methods. 
		// show(int n , int ... a) and show(int ...a) => gives error
		
		Class3 x = new Class3(); 
		int ans = x.sum(1,2,3,4,5,6); 
		System.out.println(ans);
		
		

	
		
		
	}

}
