package classNotes;
import java.util.*;
import java.io.*; 

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

interface i1201{
	static void method() {
		System.out.println("method from inteface"); 
	}
}
class c1201 implements i1201{
	public static void method() {
		System.out.println("Mthod from class"); 
	}
}


class A12 {
	
}


public class random {

	public static void main(String[] args) throws IOException{	
		
//		Byte b1 = new Byte((byte) 10); 
//		Byte b2 = new Byte((byte) 10); 
//		Byte b3 = (byte) 10; 
//		Byte b4 = (byte) 10; 
//		System.out.println(b3 == b4); 
//		System.out.println(b1.equals(b2)); 
//		System.out.println(b1 == b2); 
//		System.out.println(b1 < 12); 
		
//		int x = Byte.parseByte("76" , 8); 
//		System.out.println(x);
		
//		c1201 c1 = new c1201(); 
//		c1.method(); 
//		i1201.method(); 
		
//		FileInputStream fr = new FileInputStream("Read1.txt"); 
//		int a; 
//		while((a = fr.read()) != -1) {
//			System.out.print((char)a);
//		}
//		fr.close(); 
		
//		try(FileInputStream fr = new FileInputStream("Read1.txt")){
//			int a; 
//			while((a = fr.read()) != -1) {
//				System.out.print((char)a);
//			}
//			fr.close();
//		}catch(FileNotFoundException e) {
//			
//		}catch(IOException e) {
//			
//		}
		
//		FileReader fr = new FileReader("Read1.txt"); 
//		int a; 
//		while((a = fr.read()) != -1) {
//			System.out.print((char)a);
//		}
//		fr.close(); 
		
//		BufferedInputStream b = new BufferedInputStream(new FileInputStream("Read1.txt")); 
//		int a; 
//		System.out.println(b.available()); 
//		while((a = b.read()) != -1) {
//			System.out.print((char)a);
//		}
//		System.out.println();
//		b.close(); 
//		BufferedInputStream b1 = new BufferedInputStream(new FileInputStream("Read1.txt")); 
//		byte[] arr = new byte[100]; 
//		b1.read(arr , 10 , 35); 
//		for(int i = 0  ; i < 100 ; i++) {
//			System.out.print((char) arr[i]); 
//		}
//		System.out.println();
//		System.out.println(b1.available()); 
//		b1.close(); 
		
		
//		Scanner scan = new Scanner(new FileReader("Read1.txt"));
//		String ans = scan.nextLine(); 
//		System.out.println(ans); 
		
		
//		Byte d = new Byte((byte) 100); 
//		System.out.println(d); 
		
//		A a  = new A(); 
//		System.out.println(a); 
		
		
		
			
		
	}

}
