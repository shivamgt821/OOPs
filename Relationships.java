class P1 {
	
	public void m1() {
		
		System.out.println("m1() is running");
	}
	
}

class P2 {
	
	public void m2 () {
		
		P1 a = new P1();
		a.m1();
		System.out.println("m2() is running");
	}
	
}

class P3 {
	
	public void m3() {
		
		P2 b = new P2();
		b.m2();
		System.out.println("m3() is running");
	}
	
}

public class Relationships {
	
	public static void main(String[] args) {
		P3 c = new P3();
		c.m3();
	}
}

