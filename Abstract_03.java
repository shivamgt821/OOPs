interface Iter {
	
	public static final double PI = 3.14159; 
	
	Object m1();
	void m2();
}
class T7 implements Iter{
	
	@Override
	public Object m1() {
		
		System.out.println("m1 defined for class T7");
		return null ;
	}
	@Override
	public void m2() {
		
		System.out.println("m2 defined for class T7");
	}
	public void m3() {
		
		System.out.println("m3 defined for class T7");
	}
}
public class Abstract_03 {

	public static void main(String[] args) {

		
		Iter it = new T7();
		it.m1();
		it.m2();
		
		((T7)it).m3();
	}

}
