package MethodPractice;
//Method Call From Same Class.
public class Demo {
    //Static Method.
	public static void test1() {
	System.out.println("This is Method Of Static.");	
	}
	public static void test2() {
		System.out.println("This is Method Of Static");
	}
	
	//Non Static Method.
	public void test3() {
		System.out.println("This is Method Of Non static");
	}
	public void test4() {
		System.out.println("This is Method Of Non static");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method start.");
		//Calling for static method.
		//Class Name.Method  Name();
	
		Demo.test1();
		Demo.test2();
		//Another Method Of Calling (Direct using Method Name)
		test1();
		test2();
		
		//Calling For Non Static method
		//We have to create object class.
		//Object Creation. Classname object name=new Classname();
		
		Demo obj=new Demo();
		//call
		//object name.methodname
		obj.test3();
		obj.test4();	
	
		
	     System.out.println("Main method Ends");
		}
	}
