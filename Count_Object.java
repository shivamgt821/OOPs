class AmazonPrime
{
	static int count;
	{
		count++;
	}

public static void countObject()
{
	System.out.println(count);
}

public class Count_Object {

	public static void main(String[] args) {
//		new AmazonPrime();
//		AmazonPrime.countObject(); // 1
//
//		new AmazonPrime();
//		AmazonPrime.countObject(); // 2
//
//		new AmazonPrime();
//		AmazonPrime.countObject(); // 3
//
//		new AmazonPrime();
//		AmazonPrime.countObject(); // 4
//
//		new AmazonPrime();
//		AmazonPrime.countObject(); // 5
		
		new AmazonPrime();
		new AmazonPrime();
		new AmazonPrime();
		new AmazonPrime();
		new AmazonPrime();
		AmazonPrime.countObject(); // 5 after count of all object 

				}
	}
}
