class R1{
	
	int id;
	String name;
	
	public R1(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void m1() {
		
		System.out.println("The id is " + id);
		System.out.println("The Name is " + name);
	}
}
		
class R2{
	
	int age;
	R1 ob;
	
	public R2(int age,R1 ob) {
		this.age = age;
		this.ob = ob;
	}
	
	public void m2() {
		System.out.println("The age is " + age);
		System.out.println("The address of the object is " + ob);
	}
}

class R3 {
	
	public void m3(R1 p, R2 q) {
		p.m1();
		q.m2();
	}
}

public class Association_01 {
	
	public static void main(String [] args) {
		R1 a = new R1(10, "Shivam");
		a.m1();
		
		R2 b = new R2(25, a);
		b.m2();
		
		R3 c = new R3();
		c.m3(a,b);
	}
	
}
