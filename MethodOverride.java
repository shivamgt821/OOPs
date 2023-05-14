class Parents 
{
	public void call() 
	{
		System.out.println("9304282873");
	}
}
class Child extends Parents
{
	@Override
	public void call() 
	{
		System.out.println("8409373203");
	}
	public void belonging() 
	{
		System.out.println("I have a Bicycle");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.call();
		ch.belonging();
		
	}

}
