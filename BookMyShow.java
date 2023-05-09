import java.util.Scanner;

class Theater {
	
	int seats=50;
	
	private static Theater t = null;
	
	private Theater() 
	{
		
	}
	
	public static Theater getInstance() 
	{
		if(t==null) t=new Theater(); 
			return t;
		
	}
	
	public void reserveSeats(int numTicekts) {
		if(numTicekts>seats) {
			System.out.println(numTicekts + " seats are not available");
			System.out.println(seats + " seats are available");
			return;
		}
	
	seats =  seats - numTicekts;
	System.out.println(numTicekts + " Seats are reserved" );
	System.out.println(seats + " Seats are available" );
	}
	
}


class BookingApp {
	public void bookTicekts() {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many Ticket");
		int tickets  = scn.nextInt();
		
		Theater theater = Theater.getInstance();
		theater.reserveSeats(tickets);
	}
}

public class BookMyShow {

	public static void main(String[] args) {
		
		BookingApp cus1 = new BookingApp();
		cus1.bookTicekts();
		BookingApp cus2 = new BookingApp();
		cus2.bookTicekts();
		BookingApp cus3 = new BookingApp();
		cus3.bookTicekts();

	}

}
