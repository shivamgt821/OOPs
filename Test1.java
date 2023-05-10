class Bank 
{
	int rateOfInterest() {
	return 0;
	}
}
class SBI extends Bank
{
	int rateOfInterest() {
	super.rateOfInterest();
	return 4;
	}
}
class Axis extends Bank
{
	int rateOfInterest() {
	return 5;
	}
}
class HDFC extends Bank
{
	int rateOfInterest() {
	return 3;
	}
}
public class Test1 {

	public static void main(String[] args) {
		SBI s = new SBI();
		Axis a = new Axis();
		HDFC h = new HDFC();
		System.out.println("The Rate of intrest of SBI is :" +s.rateOfInterest());
		System.out.println("The Rate of intrest of Axis bank is :" +a.rateOfInterest());
		System.out.println("The Rate of intrest of HDFC is :" +h.rateOfInterest());

	}

}
