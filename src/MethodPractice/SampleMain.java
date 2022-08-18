package MethodPractice;

public class SampleMain {
//To Call Methods We have To create  Main methods
	public static void main(String[] args) {
		//To Call Static methods From Sample class(BLC)
		//Static method calling
		//Class name.Method name
		
		Sample.Bike1();
		Sample.Bike2();
		
	//To call NON static method.
		//Object Creation
		//Classname obj=new Classname();
		Sample veh=new Sample();
		
		//To call 
		veh.Car1();
		veh.Car2();
		
	}
}
