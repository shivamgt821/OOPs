class Bank {
	public void rateOfInterest() {
		
	}
	public void m1()
	{
		System.out.println("specific method of Bank");
	}
}
class SBI extends Bank {
	@Override
	public void rateOfInterest() {
		System.out.println("SBI bank of Rate of interest");
	}
	public void m2()
	{
		System.out.println("specific method of SBI Bank");
	}
	
}
class HDFC extends Bank 
{
	@Override
	public void rateOfInterest() {
		System.out.println("HDFC bank of Rate of interest");
	}
	public void m3()
	{
		System.out.println("specific method of HDFC Bank");
	}
}
class Axis extends Bank 
{
	@Override
	public void rateOfInterest() {
		System.out.println("Axis bank of Rate of interest");
	}
	public void m4()
	{
		System.out.println("specific method of Axis Bank");
	}
}
public class BankProject {

	public static void main(String[] args) {
	System.out.println("Upcasting start *********");
	Bank bank = new SBI();
	bank.m1();
	bank.rateOfInterest();
	System.out.println("Downcasting start *********");
	SBI sbi = (SBI) bank;
	sbi.m1();
	sbi.m2();
	sbi.rateOfInterest();
	
	System.out.println("Upcasting start *********");
	Bank bank1 = new HDFC();
	bank1.m1();
	bank1.rateOfInterest();
	System.out.println("Downcasting start *********");
	HDFC hdfc = (HDFC) bank1;
	hdfc.m1();
	hdfc.m3();
	hdfc.rateOfInterest();
	
	System.out.println("Upcasting start *********");
	Bank bank2 = new Axis();
	bank2.m1();
	bank2.rateOfInterest();
	System.out.println("Downcasting start *********");
	Axis axis = (Axis) bank2;
	axis.m1();
	axis.m4();
	axis.rateOfInterest();
		
	}

}
