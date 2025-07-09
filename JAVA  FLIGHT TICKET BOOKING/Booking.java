import java.util.HashMap;
import java.util.Scanner;

public class Booking {
    static HashMap<Integer, Passenger> passengerMap = new HashMap<>();

    public static void printflightdetails(Passenger passenger)
    {
        System.out.println("Flight ID: " + passenger.flightid);
        System.out.println("Passenger ID: " + passenger.passengerid);
        System.out.println("Total Seats Available: " + passenger.totalseats);
        System.out.println("Price per seat: " + passenger.price);
    }
    public static void bookflight(Passenger passenger,int numPassengers)
    {
        if(numPassengers<=passenger.totalseats)
        {
            passenger.totalseats-=numPassengers;
            System.out.println("Total Price: " + (passenger.price * numPassengers));
            passenger.price=passenger.price+(numPassengers * 200);
            passengerMap.put(passenger.passengerid, passenger);
            
        }
        else
        {
            System.out.println("Not enough seats available! Only " + passenger.totalseats + " seats left.");
        }
    }
    public static void cancelTicket(int flightId, int passengerId)
    {
        if(passengerMap.containsKey(passengerId))
        {   
            Passenger p= passengerMap.get(passengerId);
            if(p.flightid==flightId)
            {
                p.totalseats+= p.numPassengers;
                p.price -= (p.numPassengers * 200);
                passengerMap.remove(passengerId);
                printflightdetails(p);
                System.out.println("Flight cancelled successfully for Passenger ID: " + passengerId);
            }
            else
            {
                System.out.println("Flight ID does not match for Passenger ID: " + passengerId);
            }
        }
        else
        {
            System.out.println("No booking found for Passenger ID: " + passengerId);
            return;
        }
    }
    {

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int passengerid = 1; 
        while(flag)
        {
            System.out.println("0:Book Flight");
            System.out.println("1:Cancel Flight");
            System.out.println("2:Exit");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.out.println("Enter Flight ID:");
                    int flightId = sc.nextInt();
                    System.out.println("How many passengers?");
                    int numPassengers = sc.nextInt();
                    Passenger passenger = new Passenger(flightId,passengerid,numPassengers);
                    bookflight(passenger, numPassengers);
                    System.out.println("Flight booked successfully!");
                    printflightdetails(passenger);
                    passengerid++;
                    break;

                case 1:
                    System.out.println("Enter Flight ID to cancel:");
                    int cancelFlightId = sc.nextInt();
                    System.out.println("Enter Passenger ID to cancel:");
                    int cancelpassengerId = sc.nextInt();
                    cancelTicket(cancelFlightId, cancelpassengerId);
                    break;

                case 2:
                    flag = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
