package Arrays;

public class StringClass {
public static void main(String[] args) {
	String s="AnnapurnaNagar";
	String s1=" The Address of Police Station. ";
	
	//By using Length
	System.out.println("The length of the string ="+ s.length());
	
	//By using Uppercase conversion
	System.out.println("The uppercase conversion is ="+s.toUpperCase());
	
	//By using lowercase conversion
	System.out.println("The lower case conversion is ="+s.toLowerCase());
	
	//By using index of a perticular character
	System.out.println("The index of a character p ="+s.indexOf("p"));
	
	//by using charat()
	System.out.println("The charater  of index 4 ="+s.charAt(4));
	
	//By using last index of()
	System.out.println("The occurance of index ="+s.lastIndexOf("N"));
	
	//by using trim
	System.out.println(" The Address of Police Station. ="+s1.trim());
}
}