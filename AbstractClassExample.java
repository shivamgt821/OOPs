abstract class C1
{
	int i = 10;
	static int j = 100;
	
	public C1() {
		System.out.println("Constructor is defiend for class C ");
	}
	
	public void m1() {
		System.out.println("m1() deifned for class C");
	}
	
	public void m2() {
		System.out.println("m2() deifned for class C");
	}
//	public void m3() {
//		System.out.println("m3() deifned for class C");
//	}
	abstract public void m3(); 
	
}
class D2 extends C1 {
	@Override
	
	public void m3() {
		System.out.println("m3() deifned for class C");
	}
	
	public void m4() {
		System.out.println("m4() deifned for class C");
	}
}
public class AbstractClassExample {

	public static void main(String[] args) {
		C1 c = new D2();  // upcasting
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.i);
		System.out.println(C1.j);
		System.out.println(c.j);

		D2 d = (D2) c; // downcasting 9699
		d.m4();
		
	}

}
