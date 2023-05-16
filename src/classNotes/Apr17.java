package classNotes;
import static java.lang.System.*; 

public class Apr17 {

	public static void main(String[] args) {
		
//		try {
//			int a = 10; 
//			int b = 0; 
//			out.println(a/b); 
//		}catch(NullPointerException e) {
//			out.println("Error"); 
//		}
		
		
		// Wrong catch leads to code termination. 
		
		
		
		
		
		
		
		
		
		
		// 		MULTIPLE CATCH CLAUSES
		
		
		
		
		
		
		
		
		
		// each catch statement is inspected in order. 
		// frist one whose type matches is executed
		// exception subclass must come before any of its subclasses
		// if superclass is present before the subclass then the subclass is never reached and executed -> This is an error in java
		// Error is thrown at compile time
		
		
//		try {
//			int a = 0; 
//			int b = 46/a; 
//		}catch(ArithmeticException e) {
//			out.println("Art Error"); 
//		}catch(Exception e){
//			out.println("Some Error"); 
//		}
//		
//		try {
//			int a = 0; 
//			int b = 46/a; 
//		}catch(NullPointerException e) {
//			out.println("NULL Error"); 
//		}catch(Exception e){
//			out.println("Some Error"); 
//		}
		
		
		// ERROR -> 
		
//		try {
//			int a = 0; 
//			int b = 46/a; 
//		}catch(Exception e) {
//			out.println("Art Error"); 
//		}catch(ArithmeticException e){
//			out.println("Some Error"); 
//		}
		
		
		
		
		
		
		
		
		
		//		NESTED TRY/CATCH
		
		
		
		
		
		
		
		
//		try {
//			//int a = 5/0; 
//			try {
//				//int b = 10/0; 
//				try {
//					int arr[] = {1 , 2 , 3}; 
//					out.println(arr[10]); 
//				}catch(ArithmeticException e) {
//					out.println("inner most error"); 
//				}
//			}catch(ArithmeticException e1){
//				out.println("middle error"); 
//			}
//		}catch(ArithmeticException e2) {
//			out.println("outter Air error"); 
//		}catch(ArrayIndexOutOfBoundsException e3) {
//			out.println("outter array error"); 
//		}catch(Exception e4) {
//			out.println("outter error"); 
//		}
		
		// keep moving to outter layers from the inner layer until an catch block that matches our exception is found. 
		// If found then skip all the other excetion handlers. 
		
		
		
		
		
		
		
		
		
		//		FINALLY
		
		
		
		
		
		
		
		
		
		// finally blocked is used to execute important code -> file and connection closing. 
		// Always executed
		// After an try catch block 
		
		
		// CODE 1 -> 
		
//		try {
//			int a = 10; 
//			int b = 0; 
//			int c = a/b; 
//		}catch(ArithmeticException e) {
//			out.println("Divide by zero"); 
//		}finally {
//			out.println("Inside the finally block"); 
//		}
		
		
		// CODE 2 -> 
		
//		try {
//			int a = 10; 
//			int b = 0; 
//			int c = a/b; 
//		}catch(NullPointerException e) {
//			out.println("Divide by zero"); 
//		}finally {
//			out.println("Inside the finally block"); 
//		}
		
		// Program executed the finally blocked and then throws an exception in thread main then prints the stack trace. 
		
		
		// CODE 3 ->
		
		try {
//			int a0 = 10; 
//			int b0 = 0; 
//			int c0 = a0/b0; 
			try {
				int a = 0; 
				int b = 10; 
				int c = b/a;
			}catch(ArithmeticException e) {
				out.println("inner errror"); 
			}finally {
				out.println("inner finally"); 
			}
		}catch(NullPointerException e) {
			out.println("outter error"); 
		}finally {
			out.println("outter finally"); 
		}
		
		// try block of the child can not catch the exception of the parent.	
		

		
		
		
	}

}
