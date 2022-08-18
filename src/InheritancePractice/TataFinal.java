package InheritancePractice;

public class TataFinal {

	public static void main(String[] args) {
		
		//object creation
		Tata T1=new Tata();
		T1.Punch();
		System.out.println("##################################");
		TataV1 T2=new TataV1();
		T2.Punch();
		T2.PunchNew();
	}		
}
