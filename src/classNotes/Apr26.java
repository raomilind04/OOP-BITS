package classNotes;
import java.util.Stack; 
import java.util.*; 


// Code 1
//class oop3 implements Runnable {
//	String name;
//	oop3(String s) {
//		name = s;
//	}
//	public void run() 
//	{
//		try{
//			for(int i = 5; i > 0; i--) {
//				System.out.println("Child Thread " + name + " " + i);
//				Thread.sleep(1000);
//			}
//		} catch(InterruptedException e) {
//			System.out.println("Child interrupted "+ name);
//		}
//	}
//	
//	public void display(Thread t) {
//		//t.interrupt();
//		System.out.println(t);
//	} 
//}


// Code 2
//class oop3 implements Runnable {
//	String name;
//	oop3(String s) {
//		name = s;
//	}
//	public void run() 
//	{
//		try{
//			for(int i = 5; i > 0; i--) {
//				System.out.println("Child Thread " + name + " " + i);
//				Thread.sleep(1000);
//			}
//		} catch(InterruptedException e) {
//			System.out.println("Child interrupted "+ name);
//		}
//	}
//	
//	public void display(Thread t) {
//		t.interrupt();
//		System.out.println(t);
//	} 
//}


public class Apr26 {

	public static void main(String[] args) {
		
		
		// Code 1
//		Thread t1 = new Thread(new oop3("T1"));
//		Thread t2 = new Thread(new oop3("T2"));
//		Thread t3 = new Thread(new oop3("T3"));
//		oop3 obj = new oop3("obj");
//		Thread t = Thread.currentThread();
//		t1.start();
//		t2.start();
//		t3.start();
//		obj.display(t);
//		System.out.println("Thread One is alive: " + t1.isAlive());  
//		System.out.println("Thread Two is alive: " + t2.isAlive());
//		System.out.println("Thread Three is alive: " + t3.isAlive());
//		//wait for threads to finish
//		//t2.interrupt();
//		try {
//			System.out.println("Waiting for threads to finish");
//			t1.join();
//			//Thread.sleep(100);
//		} catch(InterruptedException e) {
//			System.out.println("Main thread interrupted");
//		}
//		//t1.start();
//		System.out.println("Thread One is alive: " + t1.isAlive());
//		System.out.println("Thread Two is alive: " + t2.isAlive());
//		System.out.println("Thread Three is alive: " + t3.isAlive());
//		//t2.resume();
//		// System.out.println("Thread One is alive: " + t1.isAlive());
//		// System.out.println("Thread Two is alive: " + t2.isAlive());
//		// System.out.println("Thread Three is alive: " + t3.isAlive());
//		//System.out.println("Child thread: " + t);
//		//System.out.println("Main thread exiting");
		
		
		// Thread state is usually only changed after the clean up and garbage collection is finished. 
		
		// Code 2
//		Thread t1 = new Thread(new oop3("T1"));
//		Thread t2 = new Thread(new oop3("T2"));
//		Thread t3 = new Thread(new oop3("T3"));
//		oop3 obj = new oop3("obj");
//		Thread t = Thread.currentThread();
//		t1.start();
//		t2.start();
//		t3.start();
//		obj.display(t);
//		if(Thread.currentThread().interrupted()) {
//			System.out.println("Interrupted"); 
//			return; 
//		}
//		System.out.println("Thread One is alive: " + t1.isAlive());  
//		System.out.println("Thread Two is alive: " + t2.isAlive());
//		System.out.println("Thread Three is alive: " + t3.isAlive());
//		try {
//			System.out.println("Waiting for threads to finish");
//			Thread.sleep(100);
//		} catch(InterruptedException e) {
//			System.out.println("Main thread interrupted");
//		}
//		System.out.println("Thread One is alive: " + t1.isAlive());
//		System.out.println("Thread Two is alive: " + t2.isAlive());
//		System.out.println("Thread Three is alive: " + t3.isAlive());
//		System.out.println("Child thread: " + t);
//		System.out.println("Main thread exiting");
		
		
		// Interruted is used for self thread
		// IsInterrupted -> used for other thread
		// Daemon threads -> Background thread which is usually used for background activites and garbage collection. 
		
		
		
		
		
		
		
		
		
		
		//			STACKS
		
		
		
		
		
		
		
		
		
		
		// Reserved area in the memory. 
		// Top Value = -1 -> Stack is empty
		// public class Stack<E> extends Vector<E> -> Stack class
		// Stacks extends the vector class
		// vector implements List
		// List extends Collection
		// Collection extends Iterable
		// List , Collection , Iterable are interfaces. 
		
		
		// Code 1
//		Stack s = new Stack(); 
//		System.out.println(s.isEmpty()); 
//		s.push(1); 
//		s.push(2); 
//		System.out.println(s.isEmpty()); 
//		System.out.println(s);
//		Object obj = s.pop();
//		System.out.println(obj); 
//		System.out.println(s); 
//		s.push("Hi"); 	// NOT an Error
//		System.out.println(s); 

		
		// Code 2
//		Stack<Integer> s = new Stack(); 
//		System.out.println(s.isEmpty()); 
//		s.push(1); 
//		s.push(2); 
//		System.out.println(s.isEmpty()); 
//		System.out.println(s);
//		Integer i = s.pop(); 
//		System.out.println(i); 
//		System.out.println(s); 
		
		// Code 3
		Stack<Integer> s = new Stack(); 
		s.push(1); 
		s.push(2); 
		s.pop(); 
		s.pop(); 
		// Import java.util.* to catch and handle EmptyStackException
		try {
			s.pop(); 
		}catch(EmptyStackException e) {
			System.out.println(e); 
		}
		System.out.println("End");
		
		
		
		
		
		
		
		
		
		
		
	}

}
