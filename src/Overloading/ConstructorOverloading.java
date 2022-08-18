package Overloading;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("This is zero argument constructor");
	}
	
	ConstructorOverloading(int a){
		System.out.println("This is one argument constructor" + a);
	}
	
	ConstructorOverloading(int a, int b){
		System.out.println("This is two argument constructor" + a+ b);
		
	}
	
	ConstructorOverloading(int a, double b){
		System.out.println("This is two argument constructor int- double" + a+ b);
	}
	
	ConstructorOverloading(double a, double b){
		System.out.println("This is two argument constructor double- double" + a+ b);
	}
	
	ConstructorOverloading(double a, double b, int c){
		System.out.println( a+ b +c);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorOverloading z = new ConstructorOverloading(10.1,10.2,10);
		
	}
}
