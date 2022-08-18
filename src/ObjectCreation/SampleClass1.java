package ObjectCreation;

public class SampleClass1 {
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
	