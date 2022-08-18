package ObjectCreation;

public class BesicOfObject {

	//Syantax of object creation
	
	//CLASSNAME OBJECTNAME = new CLASSNAME;
	

		// 1  Static methods
		// 2 non static methods
	public static void test1() {
		System.out.println("This is static method test 1");
	}
	public static void test2() {
		System.out.println("This is static method test 2");
	}
	    // non static methods
	public void test3() {
		System.out.println("This is non static method test 3");
	}
	public void test4() {
		System.out.println("This is non static method test 4");
	}
	public static void main(String[] args) {
		// call  the static methods==> ref of class == classname.methodname
		// call  non static methods ==> ref of object== objectname.methodname
		
		// static method
		
		BesicOfObject.test1();
		BesicOfObject.test2();
		
		//  Non static methods
		// classname objectname= New classname
		// object creation 
		BesicOfObject OBJ=new BesicOfObject(); 
		BesicOfObject OBJ1=new BesicOfObject();
		//call  Non Static Methods
		
		OBJ.test3();
		OBJ.test4();
		OBJ1.test3();
		OBJ1.test4();
		
		
		
		
		
	}
	
}
