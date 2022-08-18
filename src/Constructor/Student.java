package Constructor;

public class Student {
  
	int Rollno;
	String Name;
	char Grade;
	//By using constructor Approch
//	Student(int a,String b,char c){
//		Rollno=a;
//		Name=b;
//		Grade=c;
//	}
	//by using method approch 2
	public void getdetails(int a,String b,char c) {
		Rollno=a;
		Name=b;
		Grade=c;
	}
	
	
	
	
	
	
	public void Details() {
		System.out.println("The roll no="+Rollno);
		System.out.println("The name ="+Name);
		System.out.println("The Grade="+Grade);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//Approch 1
//		Student S1=new Student(111,"ram",'a');
//		S1.Details();
		//Approch 2
//		Student S2=new Student();
//		S2.getdetails(125, "Radha", 'h');
//		S2.Details();
//		
		// approch 3
		Student S3=new Student();
		S3.Grade='k';
		S3.Name="Babu";
		S3.Rollno=125;
		S3.Details();
		
		
		
		
	}
	
}
