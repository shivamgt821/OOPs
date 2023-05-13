class A
{
	public void m1()   // this method is hidden by user. 
	{
		System.out.println("Shivam");
	}
	public void m2()
	{
		System.out.println("m2() method is defined ");
	}
}
class B extends A 
{
	@Override
	public void m1() 
	{
		System.out.println("m1() method is defined ");
	}
	public void m3()
	{
		System.out.println("m3() method is defined ");
	}
}
public class Downcasting {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
//      a.m3();    // can't access specific method of subclass  
// 		for define m3() we should do downcasting. 
		B b = (B) a; // 1st way of downcasting with refrance variable.
		b.m3();
		b.m1();
		b.m2();
		System.out.println("***************************************");
		((B)a).m3(); // 2nd way of downcasting without refrance variable.
	}
}
