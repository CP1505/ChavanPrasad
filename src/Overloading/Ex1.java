package Overloading;

public class Ex1 {

	public void sum(int a) {
		System.out.println(a);
	}
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(int a,float b) {
		System.out.println(a-b);
	}
	public void sum(float a,int b) {
		System.out.println(a*b);
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void sum(float a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Ex1 z =new Ex1();
		z.sum(10);
		z.sum(10, 30);
		z.sum(100, 10);
		z.sum(21, 20);
		z.sum(10,300, 140);
		z.sum(20, 10, 30);
		
	}
}
