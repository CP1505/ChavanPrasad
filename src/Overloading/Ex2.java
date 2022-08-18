package Overloading;

public class Ex2 {

	public void over(int a) {
		System.out.println(a);
		}
	public void over(int a,int b) {
		System.out.println(a+b);
	}
	public void over(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void over(int a,double b) {
		System.out.println(a+b);
	}
	public void over(double a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Ex2 z=new Ex2();
		z.over(10);
		z.over(20.25, 12.20);
		z.over(10,120);
	}
}
