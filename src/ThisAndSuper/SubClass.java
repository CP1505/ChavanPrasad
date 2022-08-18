package ThisAndSuper;

public class SubClass extends SuperClass {

	int a=20;
	
	public void test() {
		int a=45;
		System.out.println(a);     //45
		System.out.println(this.a); //20
		System.out.println(super.a); //50
		System.out.println(super.Name); //Bike
		
	}
	
	public static void main(String[] args) {
		
		SubClass T1=new SubClass();
		T1.test();
	}
	
}
