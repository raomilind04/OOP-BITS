package classNotes;
import java.util.Stack.*;
import java.util.*; 


// 	CODE 2
//class stack1{
//	static Stack<Integer> s1 = new Stack<Integer>(); 
//	static void pts(int a) {
//		s1.push(a); 
//		System.out.println("push : " + a); 
//		System.out.println(s1); 
//	}
//	static void pfs() {
//		int temp = s1.pop(); 
//		System.out.println("pop : " + temp); 
//		System.out.println(s1); 
//	}
//}

// CODE 3

public class Apr29 {
	
	//		CODE 3
//	static void pts(Stack<Object> s1 ,int a) {
//		s1.push(a); 
//		System.out.println("push : " + a); 
//		System.out.println(s1); 
//	}
//	static void pfs(Stack<Object> s1) {
//		Integer temp = (int)s1.pop(); 
//		System.out.println("pop : " + temp); 
//		System.out.println(s1); 
//	}
	
	//		CODE 4
//	static void pts(Stack<Object> s1 ,String a) {
//		s1.push(a); 
//		System.out.println("push : " + a); 
//		System.out.println(s1); 
//	}
//	static void pfs(Stack<Object> s1) {
//		String temp = (String)s1.pop(); 
//		System.out.println("pop : " + temp); 
//		System.out.println(s1); 
//	}
	
	// 		CODE 5
//	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		// STACKS
		
		
		
		
		
		
		
		
		// 		CODE 1
//		Stack<Integer> s1 = new Stack(); 
//		s1.push(10); 
//		s1.push(20); 
//		int temp = s1.pop(); 
//		System.out.println(temp); 
//		System.out.println(s1); 
//		s1.pop(); 
//		try {
//			s1.pop(); 
//		}catch(Exception e) {
//			System.out.println("Handling an exception"); 
//		}
//		System.out.println("Handled exception");
		
		
		// 		CODE 2
//		System.out.println("stack : " + stack1.s1);
//		stack1.pts(10);
//		stack1.pts(20); 
//		stack1.pfs();
		
		
		//		CODE 3
//		Stack<Object> s2 = new Stack<Object>(); 
//		System.out.println("stack : " + s2);
//		pts(s2,10);
//		pts(s2 , 20); 
//		pfs(s2); 
		
		
		//		CODE 4 -> Same as 3 but 
//		Stack<Object> s2 = new Stack<Object>(); 
//		System.out.println("stack : " + s2);
//		pts(s2,"Hello");
//		pts(s2 , "Hello2"); 
//		pfs(s2); 
		
		
		//		CODE 5
//		push_to_stack(); 
//		peek_from_stack(); 
//		search_from_stack(5);
//		search_from_stack(10);
//		pop_from_stack(); 
	
		
		
		// 		CODE 6 -> forEach method to print the stack elements
		Stack<Integer> s1 = new Stack(); 
		s1.push(10); 
		s1.push(20);
		s1.push(30); 
		System.out.println(s1);
		s1.forEach(n->{
			System.out.println(n);
		});
		s1.pop(); 
		System.out.println(s1);
		
		
		
		
		
		
		//		STRINGS
		
		
		
		
		
		
		
		
		
		
		
		// String objects are constant and can not be changed -> immutable
		// String Literal Method -> String s2 = "Hello"
		//						 -> Checks the java pool -> If already exists -> Return a reference to the pool instance
		// New KeyWord -> String s1 = new String("Hello") -> JVM creates a new object in the heap area even if obj exits in the pool
		
		// 	CODE 1
//		String s1 = "hello"; 
//		String s2 = "hi"; 
//		String n = s1.concat(s2); 	// Create an new object and return the reference
//		System.out.println(s1); 
//		System.out.println(n);
		
	}

}
