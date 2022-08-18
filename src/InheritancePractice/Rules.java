package InheritancePractice;

public class Rules {

	 public static void main(String[] args) {
		//object creation 
		 India R=new India();
		 R.Rules();
		System.out.println("-----------------------------------------------------");
		
		State R2=new State();
		R2.Rules();
		R2.StateRules();
		System.out.println("-----------------------------------------------------");
	
	    District R3=new District();
	    R3.Rules();
	    R3.StateRules();
	    R3.DistRules();
	    System.out.println("-----------------------------------------------------");
	    
	    Taluka R4=new Taluka ();
	    R4.Rules();
	    R4.StateRules();
	    R4.DistRules();
	    R4.TalukaRules();
	 
	 
	 
	 }
}
