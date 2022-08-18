package Inheritance;

public class ChildSubBase2 {
public static void main(String[] args) {
	ParentBaseSuper obj1=new ParentBaseSuper();
	obj1.animal();
	
	ChildSubBase1 obj=new ChildSubBase1();
	
	obj1.animal();
	obj.voice();
	
	
}
}
