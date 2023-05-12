abstract class T1{ 		
	
	public void m1() { // Specific method
		
		System.out.println("m1() defined ");
	}
	abstract public void m2();
	abstract public void m3();
	abstract public void m4();
}
abstract class T2 extends T1{
	
	public void m2() {  
		
		System.out.println("m2() defined ");
	}
}
abstract class T3 extends T2{
	
	public void m3() {
		
		System.out.println("m3() defined");
	}
}
class T4 extends T3{
	
	public void m4() {
		
		System.out.println("m4() defined");
	}
}
public class Abstraction_01 {

	public static void main(String[] args) {

		T1 t = new T4();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}

}
