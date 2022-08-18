package MethodPractice;

public class ExBankEmployeeMain {
      public static void main(String[] args) {
		
    	//For Non static method object creation
    	  //Classname obj=new classname
    	  
    	  ExBankEmployee sbi=new ExBankEmployee();
    	  
    	  sbi.OfficerName="Ramesh";
    	  sbi.Department="Manager";
    	  sbi.Officecode=101;
    	  sbi.Class='A';
    	  sbi.salary=70500.25;
    	  //obj.methodname
    	  sbi.sbi1();
    	  
    	  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	  
    	  
    	  ExBankEmployee sbi2=new ExBankEmployee();
    	  
    	  sbi2.OfficerName="Mahesh";
    	  sbi2.Department="Asst.Manager";
    	  sbi2.Officecode=102;
    	  sbi2.Class='B';
    	  sbi2.salary=60500.25;
    	  //obj.methodname
    	  sbi2.sbi1();
    	  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	  ExBankEmployee sbi3=new ExBankEmployee();
    	  sbi3.OfficerName="Vikas";
    	  sbi3.Department="Clerk";
    	  sbi3.Officecode=103;
    	  sbi3.Class='c';
    	  sbi3.salary=50500.25;
    	  //obj.methodname
    	  sbi3.sbi1(); 
    	  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	  ExBankEmployee sbi4=new ExBankEmployee();
    	  sbi4.OfficerName="Radha";
    	  sbi4.Department="Clerk";
    	  sbi4.Officecode=104;
    	  sbi4.Class='c';
    	  sbi4.salary=50500.25;
    	  //obj.methodname
    	  sbi4.sbi1();
      
      }
	
}
