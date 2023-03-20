package classNotes;


abstract class Honda {
	static String color = "Red"; 
	//abstract void message(); 
	Honda(){
		System.out.println("Hey"); 
	}
	Honda(String s){
		color = s; 
		System.out.print("m g" +  " "  + color); 
	}
	public void m1() {
		System.out.println("Welcome"); 
	}
	static void Year() {
		System.out.println("This is 2022"); 
	}
}

class Suv extends Honda{
	static String color; 
	Suv(String s){
		//super(s); 
		color = s;
		//System.out.print(color); 
	}
	public void m1() {
		System.out.println("Hi , welcome to suv"); 
	}
	static void Year() {
		System.out.println("This is 2021-22"); 
	}
	public void m2() {
		System.out.println("best"); 
	}
	
}


class s{
	int g = 2; 
	private boolean man; 
	static int nw = 5; 
	static int cl = 100; 
	auto A = new auto(); 
	{
		A.display(true);
	}
	 
	void show() {
		System.out.println("Welcome"); 
		System.out.println("auto.fl"); 
		//System.out.println("m"); 
		//auto.display(true);  
	}
	static class auto{
		int g = 4; 
		double m = 11.5; 
		static int nw = 6; 
		//cl = 200; 
		//s o = new s(); 
		void display(boolean x) {
			//man = x; 
			System.out.println(g + nw);
			System.out.println(cl);
		}
	}
	
}


public class random {

	public static void main(String[] args) {
		for(int i = 0 ; i < args.length ; i++) {
			System.out.println(args[i]); 
		}
	}

}
