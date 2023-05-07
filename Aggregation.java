class T1 {
	
	public void m1() {  			  // method
		
		System.out.println("m1() method is defined");
	}
}

class T2 {
	
	public void m2(T1 obj ) {		  // method
		obj.m1();
		System.out.println("m2() method is defined ");
	}
}

public class Aggregation {
	
	public static void main(String[] args) {
		 T2 obj1 = new T2();			// this is dependent on method (Aggregation).
		 obj1.m2(new T1());
	}
}
