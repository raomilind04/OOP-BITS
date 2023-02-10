package classNotes;

//CODE 1
class Maruthi{
	int airbags = 2; 
	double mileage ; 
}

public class Feb3 {

	public static void main(String[] args) {
		// keywords are lower case
		// class members -> variable(state) , methods(behavior) , constructors(initial state of var)
		// 8 primitive type
		// access specifiers -> private , public , protected , package private (name workspace of related classes)
		// public static int x ; => static means class variable
		// Constructor : className(params) , no return type , access type is same as class
		// Method : same rules are main
		
		
		
		// OBJECTS
		
		
		
		// className objectName ; => does not define only refers (objectName contains NULL)
		// new  : dynamically allocate at run time. 
		// objectName  = new className(); -> envoke a constructor
		// className objectName = new className(); 
		// Default constructor exist 
		// (.) after object to access variables and methods
		
		// Class Access  => package private and public
		// Member Access => Private , Package , Protected , Public
		
		// CODE 1
//		Maruthi ciaz = new Maruthi(); 
//		ciaz.airbags = 3 ;
//		ciaz.mileage = 12.5; 
//		System.out.println(ciaz.airbags);
//		System.out.println(ciaz.mileage);
		 
		// CODE 2
//		Maruthi ciaz = new Maruthi(); 
//		ciaz.airbags = 3;
//		ciaz.mileage = 12.5; 
//		Maruthi b  = new Maruthi(); 
//		b.airbags = 2; 
//		b.mileage = 13.8; 
//		System.out.println("Ciaz->" + " " + ciaz.airbags +  " " + ciaz.mileage);
//		System.out.println("B->" + " " + b.airbags +  " " + b.mileage);
//		
	}

}
