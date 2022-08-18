package MethodPractice;

public class BikeOwnerMain {

	public static void main(String[] args) {
		BikeOwner B1=new BikeOwner();
		
		B1.BikeName="Busa";
		B1.Name="Chavan Prasad";
		B1.ModelNo=001;
		B1.Price=1200000;
		
		B1.Suzuki();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       
		BikeOwner B2=new BikeOwner();
		
		B2.BikeName="Honda";
		B2.Name="Ram";
		B2.ModelNo=002;
		B2.Price=2200000;
		
		B2.Suzuki();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
        BikeOwner B3=new BikeOwner();
		
		B3.BikeName="Hero";
		B3.Name="Sham";
		B3.ModelNo=003;
		B3.Price=2300000;
		
		B3.Suzuki();
	}
}
