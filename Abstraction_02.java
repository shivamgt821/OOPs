abstract class F1{   
	
	public void m1() {
		
		System.out.println("m1() defined");
	}
	abstract public void m2();
	abstract public void m3();
	abstract public void m4();
}
class F2 extends F1{    
	
	public void m2() {
		
		System.out.println("m2() defined for class F2");
	}
	public void m3() {
			
			System.out.println("m3() defined for class F2");
		}
	public void m4() {
		
		System.out.println("m4() defined for class F2");
	}
}
class F3 extends F1{
	
	public void m2() {
		
		System.out.println("m2() defined for class F3");
	}
	public void m3() {
			
			System.out.println("m3() defined for class F3");
		}
	public void m4() {
		
		System.out.println("m4() defined for class F3");
	}
}

public class Abstraction_02 {

	public static void main(String[] args) {

		F1 f = new F2();
		f.m1();
		f.m2();
		f.m3();
		f.m4();
		
		F1 f1 = new F3();
		f1.m1();
		f1.m2();
		f1.m3();
		f1.m4();
	}

}
