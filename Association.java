class E1 {
	
	public void m1() {						// method
		System.out.println("m1() Shivam is Best");
	}
}
class E2 {
	
	public void m2(E1 obj) {				// method
		obj.m1();
		System.out.println("m2() Shivam is Good");
	}
	
}
class E3 {
	public E3 (E2 obj1) {					// constructor
		obj1.m2(new E1());
		System.out.println("E3 constructor is defined");
	}
	public void m3() {						// method
		System.out.println("m3 () Shivam is Honest");
	}
	
}

public class Association {

	public static void main(String[] args) {
		E3 obj2 = new E3(new E2());			// Composition
		obj2.m3();
		
		
		E2 obj3 = new E2();					// Aggregation
		obj3.m2(new E1());
	}
}
		
