package classNotes;



interface i1 {
	void print1(); 
}
interface i2 extends i1{
	void print2(); 
}
class mi implements i2{
	public void print1() {
		System.out.println("Print from i1");
	}
	public void print2() {
		System.out.println("Print from i2");
	}
}




interface i{
	default void print() {
		// not an abstract method
		System.out.println("In i"); 
	}
}

//interface ci extends i{
//	default void print() {
//		i.super.print(); 
//		System.out.println("In ci"); 
//	}
//}

interface ci {
	default void print() {
		//i.super.print(); 
		System.out.println("In ci"); 
	}
}

class mmi implements i , ci{
	
	// implements both the i and ci interface but the access needs to be through the child ci only
	public void print() {
		//ci.super.print(); 
		// i.super.print(); -> not allowed 
		System.out.println("In m"); 
	}
}





public class Mar22 {

	public static void main(String[] args) {
		
		// interfaces support multiple inheritance
		// interfaces can not be instaintied
		// can not contain constructors
		// default -> pakage private  , can not be declared private and protected. 
		// while providing implementation of anty  method it needs to public
		// public static void -> default var of the interfaces
		
		
		// Java 8 onwards -> default and static methods. 
		
//		mi a = new mi(); 
//		i1 b = new mi(); 
//		i2 c = new mi(); 
//		a.print1(); 
//		a.print2(); 
//		b.print1();
	    //b.print2(); // error -> undefined for this
		
		
		i a = new mmi(); 
		mmi b = new mmi(); 
		ci c = new mmi(); 
		
		a.print(); 
		b.print(); 
		c.print(); 
		
		
		// 
		
		
		
		

	}

}
