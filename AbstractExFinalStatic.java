abstract class A3 {
	
	int i = 100;
	static int j = 123;
	
	final public void m1() {
		System.out.println("m1() method is defiend for final ");
	}
	
	 public static void m2() {
		System.out.println("m2() method is defiend for static ");
	}
	
	abstract public void m3();
	
}

class A4 extends A3 {
	
	@Override
	
	public void m3() {
		System.out.println("Overridden defined");
	}
}
public class AbstractExFinalStatic {

	public static void main(String[] args) {
		
		A3 a = new A4();
		System.out.println(a.i);
		System.out.println(A3.j);
		System.out.println(a.j);
		a.m1();
		a.m2();
		a.m3();
	}

}
