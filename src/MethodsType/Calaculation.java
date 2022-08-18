package MethodsType;

public class Calaculation {
	int x =20;
	int y =10;
	int a;
	
	// case -1 :- Mehods will not accept the paramerts will not return anything
//	
//	public void sum() {
//		System.out.println(x+y);
	//}
	
	// case -2 :- Mehods will not accept the paramerts will return anything
	
	public int sum() {
		a= x+y;
		return a;        // return x+y
	}
	
	//Case 3. :- Methods will accept the parameter but will not return anything
	
//	public void sum(int c, int d) {
//		System.out.println(c+d);
//	}
	
	
	//Case 4. :- Methods will accept the parameter but will return anything
	
//		public int sum(int c, int d) {
//			
//			return c+d;	
//		}
	
	public static void main(String[] args) {
		Calaculation cal= new Calaculation();
		
//		cal.sum();     // case 1
//		
		System.out.println(cal.sum());
		int z =cal.sum();
		System.out.println(z);       // case 2
		
//		cal.sum(50,50);     // case 3
//		cal.sum(150,150);     // case 3
//		cal.sum(250,250);     // case 3
//		cal.sum(550,550);     // case 3
		
//		
//		System.out.println(cal.sum(25, 25));
//		
//		int f = cal.sum(25, 25);
//		System.out.println(f);        // case 4
//		
		
		
	}

}

