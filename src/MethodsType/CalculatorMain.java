package MethodsType;

public class CalculatorMain {
public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("The addition of two numbers is "+cal.getsum(25, 50));
		System.out.println("The substraction of two numbers is "+cal.getsubstraction(500, 250));
		System.out.println("The Multiplication of two numbers is "+cal.getmultiplication(10, 10));
		System.out.println("The Division of two numbers is "+cal.getdivision(30, 4));
		System.out.println("The addition of three numbers is "+cal.getsum(100,100,100));
		
		System.out.println(cal.getsum(10, 200.5));
	}
}
