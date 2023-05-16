package classNotes;
import static java.lang.System.*; 



// Code 2
class thread implements Runnable{
	public void run() {
		out.println("In the run thread");
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



// 	Code 3
class thread2 implements Runnable{
	String name;  
	thread2(String s1){
		this.name = s1; 
		Thread t = new Thread(this , name); 
		System.out.println("New thread : " + t); 
		t.start(); 
	}
	
	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				out.println(name + " " + i); 
				Thread.sleep(1000); 
			}
		}catch(InterruptedException e) {
			out.println("Exiting"); 
		}	
	}
}



// Code 4
class thread4 implements Runnable{
	thread4(){
		Thread t = new Thread(this); 
		t.start(); 
	}
	
	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				out.println(i); 
				Thread.sleep(1000); 
			}
		}catch(InterruptedException e) {
			out.println("Exiting"); 
		}	
	}
}



// Code 5
// Can not extend other classes because that will lead to multiple inheritance
class thread5 extends Thread{
	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				out.println(i); 
				Thread.sleep(1000); 
			}
		}catch(InterruptedException e) {
			out.println("Exiting"); 
		}	
	}
}


// Code 6
class thread6 implements Runnable{
	public void run() {
		try {
			for(int i = 0 ; i < 10 ; i++) {
				out.println(i); 
				Thread.sleep(1000); 
			}
		}catch(InterruptedException e) {
			out.println("Exiting"); 
		}
		out.println("Exited"); 
	}
	public void display() {
		out.println("display function"); 
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
//		thread t1 = new thread(); 
//		Thread t = new Thread(t1); 
//		t.start();
//		out.println("Thread Called : " + t); 
//		t1.display();
//		
//		try {
//			for(int i = 100 ; i >= 0 ; i--) {
//				out.println("hello from main"); 
//				Thread.sleep(2000);
//			}
//		}catch(InterruptedException e) {
//			out.println("handle expection in child"); 
//		}
//		out.println("Exiting the main thread"); 
	
		
		
		// Code 3
//		new thread2("One"); 
//		new thread2("Two"); 
//		new thread2("Three"); 
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//			out.println("Main ending"); 
//		}
//		out.println("Code 3 over"); 
		
		
		
		// Code 4
//		thread4 t = new thread4(); 
//		try {
//			Thread.sleep(5000);
//		}catch(InterruptedException e) {
//			out.println("Exiting main"); 
//		}
//		out.println("end of code 4"); 
		
		
		// Code 5
//		thread5 t = new thread5(); 
//		t.start();
//		try {
//			Thread.sleep(5000);
//		}catch(InterruptedException e) {
//			out.println("Exiting main"); 
//		}
//		out.println("end of code 5"); 
		
		
		
		
		
		// Life Cycle of Threads
		// Born Thread -> new thread just created
		// Runnable
		// Running
		// Waiting -> The threads needs signal for execution needs to resume
		// Dead -> finished execution / Can enter dead directly from the waiting
		// Suspended -> Halt execution but can be resume from where it was suspended. 
		// Terminated -> Halt execution but can not be resumed.
		
		
		
		
		
		// Code 6
		thread6 t1 = new thread6(); 
		Thread t = new Thread(t1); 
		thread6 t2 = new thread6();
		Thread tx = new Thread(t2); 
		//t.start(); 
		tx.start();
		//out.println(t); 
		//tx.interrupt();
		//tx.stop(); 
		tx.suspend(); 
		try {
			for(int i = 1000 ; i >= 990 ; i--) {
				out.println(i); 
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			out.println("Exiting main"); 
		}
		out.println("end of code 6"); 
		tx.resume(); 
		out.println("End"); 
		
		
		
		
		
		
		
	}
}
		
		
		
