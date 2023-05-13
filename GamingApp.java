class Animal
{
	public void drink() {
		System.out.println("Every Animal need to drink");
	}
	public void sound() {
		
	}
	public void movement() {
		
	}
}
class Lion extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Lions Roars");
	}
	@Override
	public void movement() {
		System.out.println("Lions walks/runs");
	}
	public void eatFood() {
		System.out.println("Runs for food");
	}
}
class Snake extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Hhhhhhhhhhhhhhissssssss");
	}
	@Override
	public void movement() {
		System.out.println("Snake crawlings");
	}
	public void venom() {
		System.out.println("Venom is use for cancer medicine");
	}
}
class Elephant extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Elephant Rumblings");
	}
	@Override
	public void movement() {
		System.out.println("Elephant walks");
	}
	public void eatFood() {
		System.out.println("Eat Sugaercane bundle");
	}
}
public class GamingApp {

	public static void main(String[] args) {
		System.out.println("Upcasting started **********\n");
		Animal animal = new Lion();
		
		animal.sound();
		animal.movement();
		animal.drink();
		System.out.println("downcasting started *********\n");
		Lion lion = (Lion)animal;
		
		lion.sound();
		lion.movement();
		lion.drink();
		lion.eatFood();
		
		System.out.println("Upcasting started ***********\n");

		Animal animal1 = new Snake();
		animal1.sound();
		animal1.movement();
		animal1.drink();
		
		System.out.println("downcasting started********** \n");

		Snake snake = (Snake) animal1;
		snake.sound();
		snake.movement();
		snake.drink();
		snake.venom();
		
		System.out.println("Upcasting started ***********\n");
		Animal animal2 = new Elephant();
		animal2.sound();
		animal2.movement();
		animal2.drink();
		
		System.out.println("downcasting started********** \n");
		Elephant elephant  = (Elephant) animal2;
		elephant.sound();
		elephant.movement();
		elephant.eatFood();
		elephant.drink();
	}
}
