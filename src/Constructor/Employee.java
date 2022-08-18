package Constructor;

public class Employee {
          
	int id;
	String Name;
	double Salary;
	
	Employee(int x,String y,double z){
	id=x;
	Name=y;
	Salary=z;
	
	}
	
	public void Data() {
		System.out.println(id);
		System.out.println(Name);
		System.out.println(Salary);
	}
	
	
	public static void main(String[] args) {
		//Approch 1
		Employee T1=new Employee(100,"Ram",20000);
		T1.Data();
		System.out.println("*****************************************");
		Employee T2=new Employee(33,"Ramesh",133.25);
		T2.Data();
		
		
		
	}
}

