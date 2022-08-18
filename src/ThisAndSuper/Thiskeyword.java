package ThisAndSuper;

public class Thiskeyword {
        int a;  //global variable
        int b;
        
        public void getvalues(int a,int b) {   //local variable
        	this.a=a;
        	this.b=b;
        	
        	
        }
        public void printvalues() {
        	System.out.println(a);
        	System.out.println(b);
        }
        public static void main(String[] args) {
			Thiskeyword T1=new Thiskeyword();
			T1.getvalues(15, 20);
			T1.printvalues();
		}
}
