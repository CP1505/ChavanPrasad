package InheritancePractice;

public class TwitterFinal {

	public static void main(String[] args) {
		
		TwitterV update=new TwitterV(); //For Object creating.
		update.v();  //for calling. 
		
		System.out.println("*****************************************");
		//Twitterfinal class is a ststic class so that we have to call non static method in this class 
		//we have to create object and after we call by object.methodname
		
		TwitterV1 update1=new TwitterV1();
		update1.v();
		update1.v1();
		
		System.out.println("*****************************************");
	
		TwitterV2 update2=new TwitterV2();
		
		update2.v();
		update2.v1();
		update2.v2();
		System.out.println("*****************************************");
	
	}
}
