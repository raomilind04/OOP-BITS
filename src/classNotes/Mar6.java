package classNotes;

class Carr{
	boolean auto_gear;
	int speed; 
	
	Carr(boolean auto_gear , int speed){
		this.auto_gear = auto_gear; 
		this.speed = speed; 
		System.out.println("This is the car class"); 
	}
	Carr(){
		
	}
	void decelerate(int decrement) {
		speed -= decrement; 
	}
	void accelerate(int inc) {
		speed += inc; 
	}
	
	String toDisplay() {
		return ("auto Carr : " + this.auto_gear + "\n" + "speed : " + this.speed); 
	}
}

class Sedan extends Carr{
	static int carLength; 
	Sedan(boolean auto_gear , int speed , int carLength){
		super(auto_gear , speed); 
		this.carLength = carLength; 
		System.out.println("This is sedan");
	}
	
	void setLength(int newLength) {
		this.carLength = newLength; 
	}
	
	String toDisplay() {
		return (super.toDisplay() + "\nCar Length : " + this.carLength); 
	}
	
	void show() {
		System.out.println("This is Sedan"); 
	}
	 
}

class Hatchback extends Carr{
	static int carLength; 
	Hatchback(boolean auto_gear , int speed , int carLength){
		super(); 
		this.auto_gear  = auto_gear; 
		this.speed = speed; 
		this.carLength = carLength; 
		System.out.println("This is Hatchback");
	}
	
	void setLength(int newLength) {
		carLength = newLength; 
	}
	
	String toDisplay() {
		return (super.toDisplay() + "\nCar Length : " + carLength); 
	}
	
	void show() {
		System.out.println("This is Hatchback"); 
	}
}

class HondaAmaze extends Hatchback {
	HondaAmaze(){
		super(true , 1 , 2); 
		System.out.println("This is Amaze");
	}
}






//  ABSTRACT CLASSES






abstract class abs{
	abstract void run(); 
	
	int x;  
	abs(int x){
		this.x = x; 
		System.out.println("x : " + x + " From abs"); 
	}
	final void mul() {
		System.out.println(this.x + "*2 = "+ x*2);
		
	}
}

class absChild extends abs{
	absChild(int x){
		super(x); 
		System.out.println("x : " + x + " From absChild");
	}
	void run() {
		System.out.println("Child 1"); 
		mul(); 
	}
}

class absChild2 extends abs{
	absChild2(int x){
		super(x); 
		System.out.println("x : " + x + " From absChild2");
	}
	void run() {
		System.out.println("Child 2"); 
		mul();
	}
}




public class Mar6 {

	public static void main(String[] args) {
		
//		Sedan car1 = new Sedan(false , 100 ,4); 
//		Hatchback car2 = new Hatchback(true , 150 , 3); 
//		HondaAmaze car3 = new HondaAmaze(); 
//		
//		Carr cars[] = new Carr[2];
//		cars[0] = car1; 
//		cars[1] = car2; 
//		car1.show(); 
//		car2.show(); 
//		System.out.println(car1.toDisplay());
//		System.out.println(cars[0].toDisplay());
//		System.out.println(cars[1].toDisplay());
//		System.out.println(car3.toDisplay());
		
		//cars[0].show() -> Gives an error; 		
		
		
		
		
		
		
		
		// ABSTRACT CLASSES
		
		
		
		
		
		
		
		//	Don not implement all the methods in the parent. 
		// Make the parent class -> extend the parent class and implement the method. 
		// abstract className
		// Abstract classes are incomplete on thier own , can not be accessed directly. 
		// non-abstract classes can not have abstarct methods. 
		// Abstract classes do not provide 100% abstraction -> can contain normal implemented methods -> interfaces provide 100% abstraction.
		// All abstract methods need to implemented in the extending the classes. 
		// Constructor can not be abstract. 
		// If abstract classes contains contains final - > can not be defined in the children class. 
		
		
		// abs o1 = new abs() -> Gives an error
		absChild o1 = new absChild(2); 
		o1.run(); 
		absChild2 o2 = new absChild2(3); 
		o2.run(); 
//		
	}

}
