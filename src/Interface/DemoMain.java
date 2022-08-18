package Interface;

public class DemoMain implements Demo {


	public void test() {
		System.out.println("Pune Velocity");
		
		
	}

	
	public void test1() {
	System.out.println("Katraj");
		
	}
	
	public static void main(String[] args) {
		
		DemoMain obj=new DemoMain();
		obj.test();
		obj.test1();
	}

}
