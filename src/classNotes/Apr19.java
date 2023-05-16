package classNotes;
import static java.lang.System.*;

public class Apr19 {
	//	CODE 1
	static void greaterThan(int num) {
		if(num < 10) {
			throw new NullPointerException("Less than"); 
		}else {
			out.println("greater than 10"); 
		}
	}
	
	
	// Code 2
	static void check(int n , boolean allow) {
		if(n > 10 && !allow) {
			throw new NullPointerException("check not passed"); 
		}else {
			out.println("passed the check"); 
		}
	}
	
	
	// Code 3
	static void check2(int n) throws InterruptedException{
		if(n > 10) {
			throw new InterruptedException("Failed the check"); 
		}else {
			out.println("Passes check"); 
		}
	}
	
	
	// Code 4
	static void check3(int n) {
		try {
			if(n > 10) {
				throw new InterruptedException("Failed the check"); 
			}else {
				out.println("Passes check"); 
			}
		}catch(InterruptedException e) {
			out.println("Handling Exception"); 
		}
	}
	
	// Code 5
	static class exp extends Exception{
		
	}
	static class exp2 extends Exception{
		
	}
	static void check5(int n) {
		try {
			if(n == 0) {
				throw new exp(); 
			}
			if(n > 10) {
				throw new exp2(); 
			}
		}catch(exp e) {
			out.println("Handling exp"); 
		}catch(exp2 e) {
			out.println("handling exp2"); 
		}
		out.println("End of check5"); 
	}
	
	// Code 6
	static class ExpNew extends Exception{
		
	}
	static class ExpNew2 extends Exception{
		
	}
	static void check6(int n) throws ExpNew , ExpNew2{
			if(n == 0) {
				throw new ExpNew(); 
			}
			if(n > 10) {
				throw new ExpNew2(); 
			}
			out.println("Handling exp");
			out.println("handling exp2");
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		// 	THROWS KEYWORD
		
		
		
		
		
		
		
		
		// Code 2
//		try {
//			check(20 , false); 
//		}catch(NullPointerException e) {
//			out.println("handling the excption"); 
//		}
//		out.println("handled the exception"); 
		
		
		
		
		// InterruptedException -> must be caught and declared otherwise it will throw an error -> Checked Exceptions
		// You are forced to handle checked exception at compile time
		// Method thows exceptions but does not handle them. 
		
	
		
		
		// Code 3
//		try {
//			check2(20); 
//		}catch(InterruptedException e) {
//			out.println("Handling Exception"); 
//		}
//		out.println("Handled Exception"); 
		
		
		// Code 4
//		check3(20);
//		out.println("End of code4"); 
		
		
		
		
		
		
		// 		USER DEFINED EXCEPTIONS -> are checked exceptions by default
		
		
		
		
		
		
		
		 //Code 5
//		check5(0);
//		check5(100); 
//		check5(5); 
		
		
		//	Code 6
//		try {
//			check6(20); 
//		}catch(ExpNew e) {
//			out.println("Handling expNew"); 
//		}catch(ExpNew2 e) {
//			out.println("Handling expNew2"); 
//		}
//		out.println("Handled Exception"); 
//		try {
//			check6(0); 
//		}catch(ExpNew e) {
//			out.println("Handling expNew"); 
//		}catch(ExpNew2 e) {
//			out.println("Handling expNew2"); 
//		}
//		out.println("Handled Exception"); 
		
		
		
		
		
		// 			PRINTING TOOLS
		
		
		
		
		
		
		
		// Code 7
		
//		int a = 0; 
//		int b = 10; 
//		try {
//			b= b/a; 
//		}catch(ArithmeticException e) {
//			out.println(e); 
//			e.printStackTrace(); 
//			out.println(e.getMessage()); 
//			String m = e.toString();
//			out.println(m); 
//		}

		
	}
}
