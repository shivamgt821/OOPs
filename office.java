abstract class Bank2 
{
	private String bankName;
	
	Bank2(String bankName)
	{
		this.bankName = bankName;
	}
	public String getBankName()
	{
		return bankName;
	}
}
public class office extends Bank2 
{
	office()
	{
		super("Axis Bank");
	}
	public static void main(String[] args) 
	{
		Bank2 bank = new office();
		System.out.println(bank.getBankName());
	}

}
