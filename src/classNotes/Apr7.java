package classNotes;

public class Apr7 {

	public static void main(String[] args) {
		
		
		
		
		
		// 		PACKAGES
		
		
		
		
		
		
		// same name for multiple class
		// no same name in a single package -> avoid collisions
		// encapsulate -> group classes , subclasses , interfaces
		// package package_name -> which package does this file belong to -> by deafult it goes to the no name default package
		// 3 ways for the java to know where to look for the package ->
		//		1 -> current pwd
		//		2 -> use -classpath/-cp option in java
		//		3 -> dir path by setting CLASSPATH env variable
		// number of classes = number of classfiles
		// import right after package but before any class definations
		//	public will be availabe to non subclasses of the packages
		
		
		// define package wrt to the pwd
		// import package_Name.class_Name
		
		
		
		
		// 1->  	Import using packageName.className -> 
		
		// nested class is static -> (packA2.demo)
		//			outterClass obj = new outterClass()
		//			outterClass.innerClass obj = new outterClass.innerClass()
		// static -> className.memberName
		// non static -> obj creation
		// no access to private and protected from the class in the other package
		
		
		// 2->		import static packageName.className.*
		
		// packA2.outterClass obj= new packA2.outterClass()
		// innerClass obj = new innerClass();
		// Outter Members -> 
		// 		static -> wihtout classname -> just use the membername
		// 		non static -> obj creation
		// Inner Members -> 
		// 		static -> className.memberName
		// 		non static -> obj creation
		
		
		// 3-> 		packageName.className.nestedStaticClass.*
		
		// Nested  class should be static
		// packA2 -> package | demo ->  class inside packA2 | a11 -> nested static class in the demo class
		// packA2.demo.a11 a = new packA2.demo.a11() -> creating an object of inner class
		// Static members can be directly accessed | no non static memberes inside static class
		// packA2.demo d = new packA2.demo() -> creating an object of the outter class
		// packA2.demo.memberName -> accessing the static members of the outter class
		// non static -> through objs
		
		
		// 4->		import static packageName.className.nestedStaticClass.*
		
		// packA2.demo d = new packA2.demo(); 
		// packA2.demo.a11 a = d.new a11(); 
		// staatic members access directly without the className. 
		
		
		// 5->		import packA2.demo.*
		
		// Does not know the path
		// packA2.demo d = new packA2.demo(); 
		
		

	}

}
