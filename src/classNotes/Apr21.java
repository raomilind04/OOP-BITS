package classNotes;
import static java.lang.System.*; 


class thread implements Runnable{
	public void run() {
		out.print("In the run thread");
		try {
			for(int i = 0 ; i < 100 ; i++) {
				out.println("hello from run"); 
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			out.println("handle expection in child"); 
		}
		out.println("Exiting the thread"); 
		}
	
		public void display() {
			out.println("display in run");
		}
}

public class Apr21 {
	

	public static void main(String[] args) {
		
		
		
		
		
		
		
		//		Threads
		
		
		
		
		
		
		
		
		// Multiprogramming -> context switching
		// Multitasking and Multiprocessing. 
		// Program is an passive entity
		// A program in exceution is an active entity -> Active entity
		// Split code into into small code segements -> These segments are called Threads (Lightweight Process)
		// Code Section, Data section and files of the OS are shared by threads.
		// Main thread automatically created when the code runs.
		// Main thread should be the last one to finsih execution.
		
		// System Thread Group -> 
		//			JVM threads that deals with object finalization
		//			root thread group
		// Main Thread Group ->
		//			Atleast one should exist to run the main function bytecode
		//			Call the currentThread -> returns the reference of the calling thread.
		//			currentThread is an public static method
		//			print x -> Name , Priority , Thread Group
		
		
		
		// Code 1
//		Thread x = Thread.currentThread(); 
//		out.println(x); 
//		x.setName("main Thread");
//		out.println(x); 
//		try {
//			for(int i = 0 ; i < 100 ; i++) {
//				out.println("hello"); 
//				Thread.sleep(1000);
//			}
//		}catch(InterruptedException e) {
//			out.println("handle e"); 
//		}
		
		
		// Start() -> Called to start the execution of a new thread -> Executes an call to the run()
		// Run() -> Establishes the entry point for thread execution
		
		
		
		// Code 2
		thread t1 = new thread(); 
		Thread t = new Thread(t1); 
		t.start();
		out.println("Thread Called : " + t); 
		t1.display();
		
		try {
			for(int i = 100 ; i >= 0 ; i--) {
				out.println("hello from main"); 
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			out.println("handle expection in child"); 
		}
		out.println("Exiting the main thread"); 
	
	}

}
