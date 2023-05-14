class C
{
	public void m1()   // this method is hidden by user. 
	{
	
		
	}
	public void m2()
	{
		System.out.println("m2() method is defined ");
	}
}
class D extends C
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
public class Upcasting 
{

	public static void main(String[] args) 
	{
		C c = new D();
		c.m1();
		c.m2();
	}
}
