package MethodsTypePractice;

public class SamsungCalculatorMain {

	
	//main method
	public static void main(String[] args) {
		//object creation
		
		SamsungCalculator cal =new SamsungCalculator();
		
		//cal.sum();   //Case 1
		//cal.sum();   //case 2
		//System.out.println(cal.sum());     //case 2
		
		//cal.sum(10, 20);  //case 3
		
		//cal.sum(10, 40);  // case 4
		
		System.out.println(cal.sum(10, 40));
		System.out.println(cal.sub(50, 25));
	    System.out.println(cal.multi(10, 5));
	    System.out.println(cal.div(100, 25));
	}
	
	
	
}
