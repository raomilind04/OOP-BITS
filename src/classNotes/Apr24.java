package classNotes;
import static java.lang.System.*; 


// Code 1 2 3
class thread24 extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			out.println("thred 1 : " + i); 
		}
	}
}

// Code 4
class thread242 implements Runnable{
	String name ;
	 thread242(String s){
		 name = s; 
	 }
	 public void run() {
		 try {
				for(int i = 0 ; i < 10 ; i++) {
					out.println(name + " " + i); 
					Thread.sleep(1000);
				}
			}catch(InterruptedException e) {
				out.println(name + " handling expection"); 
			}
	 }
	 public void display(Thread t) {
		 System.out.println("t"); 
	 }
}

public class Apr24 {

	public static void main(String[] args) {
		
		
		
		
		// 		JOINABLE THREADS
		
		
		
		//	Code 1
//		thread24 t = new thread24(); 
//		t.start(); 
//		if(t.isAlive()) {
//			out.println("Thread 1 is still alive"); 
//		}
//		out.println("End of code 1"); 
		
		
		// Code 2
//		thread24 t = new thread24(); 
//		t.start(); 
//		while(t.isAlive()); 
//		if(t.isAlive()) {
//			out.println("Thread 1 is still alive"); 
//		}else {
//			out.println("Thread 1 already over"); 
//		}
//		out.println("End of code 1"); 
		
		
		// Code 3
//		thread24 t = new thread24(); 
//		t.start(); 
//		try {
//			t.join(); 
//		}catch(InterruptedException e) {
//			out.println("Handling exception"); 
//		}
//		if(t.isAlive()) {
//			out.println("Thread 1 is still alive"); 
//		}else {
//			out.println("Thread 1 already over"); 
//		}
//		out.println("End of code 1"); 
//		
		
		// A thread thats has finished its execution can not be restarted. 
		// Timeperiod in sleep can not be negetive. 
		
		
		
		// Code 4
		thread242 t1 = new thread242("t1"); 
		Thread t11 = new Thread(t1); 
		thread242 t2 = new thread242("t2"); 
		Thread t22 = new Thread(t2); 
		thread242 t3 = new thread242("t3"); 
		Thread t33 = new Thread(t3); 
		
		Thread t = Thread.currentThread(); 
		t11.start(); 
		t22.start();
		t33.start();
		out.println("T1 : " + t11.isAlive()); 
		out.println("T2 : " + t22.isAlive()); 
		out.println("T3 : " + t33.isAlive()); 
		
		//t22.suspend();
		t22.interrupt();
		try {
			out.println("Waiting for other thread to join"); 
			t11.join(); 
		}catch(InterruptedException e) {
			out.println("Handle exception in Main thread"); 
		}
		//t11.start(); 
		out.println("T1 : " + t11.isAlive()); 
		out.println("T2 : " + t22.isAlive()); 
		out.println("T3 : " + t33.isAlive()); 
		t22.resume();
		out.println("T1 : " + t11.isAlive()); 
		out.println("T2 : " + t22.isAlive()); 
		out.println("T3 : " + t33.isAlive()); 
		
		out.println("END"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
