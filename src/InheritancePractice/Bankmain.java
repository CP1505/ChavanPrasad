package InheritancePractice;

public class Bankmain {
        
	public static void main(String[] args) {
		Rbi R1=new Rbi();
		R1.RulesandRegulations();
		System.out.println("===========================================");
	
		Axis R2=new Axis();
		R2.RulesandRegulations();
		R2.AxisBank();
		System.out.println("===========================================");
		
		Hdfc R3=new Hdfc();
		R3.RulesandRegulations();
		R3.Hdfcbank();
	    System.out.println("===========================================");
	    
	    Sbi R4=new Sbi();
	    R4.RulesandRegulations();
	    R4.Sbirules();
	
	
	
	
	
	
	}
}
