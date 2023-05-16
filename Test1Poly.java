class GrandParent{
	public void print() {
		System.out.println("A");
	}
}
class Parent extends GrandParent{
	public void print() {
		System.out.println("B");
	}
}
class Child extends Parent{
	public void print() {
		super.print();
		System.out.println("C");
	}
public class Test1Poly {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();
		}

	}
}
