package ThisAndSuper;
//this example
public class ThisEx {

	int a=20;                  //Global variable  
	static int c=30;           //static variable
	
	public void test() {
		
		int a=50;              //Local variable
		
		
		System.out.println(a);
		System.out.println(this.a);
		
		}
	public static void main(String[] args) {
		
		ThisEx E1=new ThisEx();
		E1.test();
	}
	
}
