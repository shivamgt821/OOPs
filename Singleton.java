class D {
	
	private static D d;
	private D() {
		
	}
	public static D getInstance() {
		if(d==null) d = new D();
		return d;
	}
}
public class Singleton {

	public static void main(String[] args) {
		
		D d1 = D.getInstance();
		D d2 = D.getInstance();
		D d3 = D.getInstance();
		
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d2==d3);
	}
	

}
