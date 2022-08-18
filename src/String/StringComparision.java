package String;

public class StringComparision {
public static void main(String[] args) {
	String s="annapurnanagar";
	String s1="ANNAPURNANAGAR";
	 String s2="nagar";
	 String s3="";
	String s4="Pune";
	String s5="Kothrude";
	String s6="Today@Is@Fun@Day";
	System.out.println(s.length());
     //Equals()
	System.out.println(s.equals(s1));
	
	//equalignorecase
	System.out.println(s.equalsIgnoreCase(s1));
	
	//contains
	System.out.println(s.contains(s2));
	
	//isempty()
	System.out.println(s3.isEmpty());
	
	//concat()
	
	System.out.println(s4.concat(s5));
	System.out.println(s5.concat("PimpriChinchwad"));
	
	//Startwith
	
	System.out.println(s.startsWith("anna"));
	
	//Endwith
	System.out.println(s.endsWith("ar"));
	
	//Split
String words []= s6.split("@");
for(int i=0;i<words.length;i++)
{
	System.out.println(words[i]);
}

//Replace
System.out.println(s6.replace("Fun", "Sunday"));

	
	//Substring
System.out.println(s.substring(4));
System.out.println(s.substring(4, 9));
	
}
}
