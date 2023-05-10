class A 
{
	private void m1 () 
	{
		System.out.println("m1 () is defiend ");
	}
}

class B extends A 
{		
	
	public void m1() 
	{
		System.out.println("m2 () is defiend ");
		// The method m1() type B must override or implement a super type method
	}
}

public class Private_over_ride {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}
