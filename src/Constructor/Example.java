package Constructor;

public class Example {
//Without argument 
	int a;
	String S;
	
	Example(){
		System.out.println("This is Zero/Without Argument constructor");
		a=20;
		S="Pune";
	}

	Example(int c, String St){
		System.out.println("This is with Argument Constructor");
		a=c;
		S=St;
	}
	
	
	
	
	
	
	
	public void Ex() {
		System.out.println(a);
		System.out.println(S);
	}
	
	
	
	
	
}
