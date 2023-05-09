class C1 {
	
	public void m1() { 			//method
		System.out.println("Shivam is good");
	}
}

class C2 {
	
	public C2(C1 obj1) { 		//constructor
		obj1.m1();
		System.out.println("Surya is Good");
	}
}

public class Composition {
	public static void main(String[] args) {
		
		C2 obj2 = new C2(new C1()); // this is dependent on object (Constructor)

	}
}
