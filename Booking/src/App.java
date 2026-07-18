public class App
{
	public static void main(String args[])
	{
		Booking b1=new Booking(101,"20-2-2002",2,30000,"london","economy");
		Booking b2=new Booking(102,"24-3-2004",3,50000,"dubai","business");
		Booking b3=new Booking(104,"30-4-2009",4,60000,"tokyo","economy");

		b1.ticketConfirmation();
		b2.ticketConfirmation();
		b3.ticketConfirmation();
	}
}