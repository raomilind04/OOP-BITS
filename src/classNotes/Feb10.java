package classNotes;

class Lol{
	int x = 10; 
	static int y = 29; 
	public static void disp() {
		// System.out.println(x) ; // can not have nono static referenced from a static context; 
		 System.out.println(y); 
		 y++; 
	}
//	public static void disp1() {
//		int ans = sum(5); // Error -> Cannot make a static reference to the non-static method sum(int) from the type Lol
//		System.out.println(ans); 
//	}
//	int sum(int x) {
//		return x++;  
//	}
	
}

class Mo{
	int sum ;  
	 
	// Error => Duplicate method add(int, int) in type Mo
	// not method overloading
//	int add(int a , int b) {
//		return a+b; 
//	}
//	void add(int a , int b) {
//		sum = a+b; 
//	}
	
	int add(int a , int b, int c) {
		return a+b+c; 
	}
	int add(int a , int b) {
		return a+b; 
	}
	
	void disp(int n , String s) {
		System.out.println("Type1"); 
		for(int i = 0 ; i < n ; i++) {
			System.out.println(i +  " "  + s); 
		}
		
	}
	void disp(String s) {
		System.out.println("Type2"); 
		System.out.println(s); 
	}
	
	// Overloading resolution for char but not float
	void disp(int x) {
		System.out.println(x);
	}
	
	
}

public class Feb10 {

	public static void main(String[] args) {
		
		
		// STATIC METHODS
		
		
		
		// Static methods can only use static data of their classes
		// only other static methods can be referenced
		// can be directly accessed without creating a object
		
		
//		Lol.disp();  // directly access method without object
//		Lol.disp();
		
		// static reference in non static context is allowed
		// non static method can not be accesed from a static method

		//We cannot declare static variables in the main() method or any kind of method of the class. 
		//The static variables must be declared as a class member in the class.
		//during compilation time JVM binds static variables to the class level that means they have to be declared as class members.
		
		
		
		
		// METHOD OVERLOADING
		
		
		
		// make polym in java possible
		// void func() , void func(int a) , void func(int a , int b) => overloaded
		// may or may not have different return types but the number of arguments need to be different
		// types- > 1. can number of args 2. change types of args
		// automatic type conversion if no method defination matches => overlaod resolution
		// lossy conversion are not allowed in overload resolution
		
//		Mo n1 = new Mo(); 
//		int ans1 = n1.add(1 , 2); 
//		int ans2 = n1.add(1 , 2 , 3); 
//		System.out.println(ans1 + " " + ans2);
//		n1.disp(3 , "Hello");
//		System.out.println(System.lineSeparator()); 
//		n1.disp("Hello1"); 
//		
//		n1.disp('z'); // only int def exit for disp function so java converts z to int and prints its ASCII value. 
//		n1.disp(12.55); // Error =>  n1 cannot be resolved
		
		
		
		
		// MAIN OVER LOADING
		
		
		
		
		// main can also be overloaded
		// JVM looks for method signature (String[]  args)
		// overloaded main method are called and executed only if they are called from the main method
		
//		System.out.println("First main method"); 
//		main("hello"); 
		
		
	}
	
	public static void main(String args1) {
		System.out.println("Second main method");
		System.out.println(args1);
	}

}
