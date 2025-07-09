import java.util.ArrayList;
import java.util.List;

public class Taxi{
    static int taxicount=0;
    int id;
    boolean booked;
    int freetime;
    int totalearning;
    List<String> trips;
    char currentspot;

    public Taxi()
    {
        booked = false;
        currentspot = 'A';
        freetime = 6;
        totalearning = 0;
        trips=new ArrayList<String>();
        taxicount++;
        id = taxicount;
    }
    public void setdetails(boolean booked,int freetime,int totalearning,String tripsdetails,char currentspot)
    {
        this.booked = booked;
        this.freetime = freetime;
        this.totalearning = totalearning;
        this.trips.add(tripsdetails);
        this.currentspot = currentspot;
    }
    public void printdetail()
    {
        System.out.println("Taxi ID: " + this.id + "total earning:" + this.totalearning);
        System.out.println("TaxiID  BookingID  CustomerID  From  To  picktime  droptime  Fare");
        for(String trip:trips)
        {
            System.out.println(id+"            "+trip);
        }
        System.out.println("---------------------------------------");
    }
    
}
