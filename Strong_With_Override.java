import java.util.Scanner;

class Factorial 
{
	public int factor(int num) 
	{
		int fact = 1;
		for(int i=1 ; i<=num ;i++)
		fact*=i;
		return fact;
	}
}
class Strong_Num extends Factorial
{
	@Override
	public int factor(int num) 
	{
		if((num==0) || (num==1))
		return 1;
		return num*factor(num-1);
	}
	
	public int strong(int num) 
	{
		int sum;
		for(sum=0;num>0;num/=10)
		sum +=factor(num%10);
		return sum;
	}
}
public class Strong_With_Override {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int number = scn.nextInt();
		Strong_Num sn = new Strong_Num();
		int result=sn.strong(number);
		
		if(result == number) System.out.println("Strong Number");
		else System.out.println("Not A Strong Number");
	}

}
