package MethodsTypePractice;

public class SamsungCalculator {
      
	 int x=200;
	 int y=300;
	 
	//Case 1= no parameter no return
	
//	public void sum() {
//		System.out.println(x+y);
//	}
	 
	//case 2=no parameter yes return
	
//	public int sum() {
//		return x+y;
//		
//	}
	// case 3
	// yes parameter no return
	 
//	 public void sum(int a,int b) {
//		 System.out.println(a+b);
//	 }
//	
	
	//Case 4 yes parameter yes return
	 //addition
	 public int sum(int a,int b) {
		 return a+b;
	 }
	//substraction
	public int sub(int a,int b) {
		return a-b;
	}
	//multiplication
	public int multi(int a,int b) {
		return a*b;
	}
	//divide
	public int div(int a,int b) {
		return a/b;
	}
	
}
