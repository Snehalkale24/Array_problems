public class Booking
{
    private int id;
    private String departureDate;
    private int numberOfTickets;
    private double price;
    private String cabinType;
    private double totalPrice;
    private String destination;

    public Booking(int bookingID,
                   String departureDate,
                   int numberOfTickets,
                   double price,
                   String destination,
                   String cabinType)
    {
        this.id = bookingID;
        this.departureDate = departureDate;
        this.numberOfTickets = numberOfTickets;
        this.price = price;
        this.destination = destination;
        this.cabinType = cabinType;

        totalPrice();
    }

    public int getId(){
        return id;
    }

    public String getDepartureDate(){
        return departureDate;
    }

    public int getNumberOfTickets(){
        return numberOfTickets;
    }

    public double getPrice(){
        return price;
    }

    public String getCabinType(){
        return cabinType;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String getDestination(){
        return destination;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDepartureDate(String departureDate){
        this.departureDate = departureDate;
    }

    public void setNumberOfTickets(int numberOfTickets){
        this.numberOfTickets = numberOfTickets;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void totalPrice(){
        totalPrice = numberOfTickets * price;
    }

    public void ticketConfirmation()
    {
        System.out.println("------------------");
        System.out.println("Booking id : " + id);
        System.out.println("Departure Date : " + departureDate);
        System.out.println("Destination : " + destination);
        System.out.println("Cabin Type : " + cabinType);
        System.out.println("No of Tickets : " + numberOfTickets);
        System.out.println("Price per Ticket : " + price);
        System.out.println("Total Price : " + totalPrice);
    }
}