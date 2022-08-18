package IfElsePractice;

public class ExIfElseIf {
	public static void main(String[] args) {
int num=1;
if(num<100 && num>=10)
{System.out.println("It is a two digit number");
}
else if (num<1000 && num>=100){System.out.println("It is a Three digit number");}
else if (num<10000 && num>=1000) {System.out.println("It is a four digit number");}
else if (num<100000 && num>=10000) {System.out.println("It is a five digit number");}
else if (num<10 && num>=1) {System.out.println("It is a Single digit number");}
else {System.out.println("The number is not between 1 and 99999");}

	
	
	
	
	
	
	
	}

}
