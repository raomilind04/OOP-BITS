package classNotes;
//import java.lang.Math.*; 
import static java.lang.Math.*; 
import static java.lang.System.*; 

public class Apr10 {

	public static void main(String[] args) {
		
		
		
		
		// 		IMPORTING JAVA LANG CLASSES
		
		
		
		
		
		
		// throws error without math
//		double x = Math.PI*10; 
//		System.out.println(x); 
		
		// Without math function -> import with staatic keyword
//		double x = PI*10; 
//		System.out.println(x); 
		// No need to use the system keyword because the class has been imported statically
//		out.println(x); 
		
		
		
		
		
		
		
		
		
		//		EXCEPTION HANDLING
		
		
		
		
		
		
		
		// Handling of abnormal termination of code execution
		// Error may occur at run time or compile time
		// Exceptions ->	- User defined
		//					- Built-in Exception
		// Checked Exceptions => compile time -> need to be resolved at comiple time itself
		// Unchecked Exceptions => runtime -> ignored at compile time
		// int x = 1/0 -> Divide by zero error -> Checked at runtime
		
		// Java lang -> Object -> throwable -> Exception (Checked or Unchecked) OR Error
		// When error is detected the java runtime system creates an exception object
		// Stack trace -> what exe led to the error
		// ArthmeticError , NullPointerException , NumberFormatException , ArrayIndexOutofBound
		
		
		
		// 	TRY , CATCH , THROW
		
		// Exception code in try block
		// followed by an catch or finally block
		// catch can not be used alone without try
		// try block code is always executed 
		// throws -> declare exceptions -> tells the java runtime that there may be an exception
		// throws is always used with the method signature
		
		
		int a , b; 
		try {
			a = 0; 
			b = 15; 
			b /= a; 
		}catch(ArithmeticException h){
			System.out.println("Can not divide by zero"); 
		}
		System.out.println("Handled Exception"); 
		
		// Error type needs to be correct otherwise catch will not be executed
		
		
		
	}

}
