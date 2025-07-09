public class Passenger{
    int flightid;
    int passengerid;
    int totalseats;
    int price;
    int numPassengers;
    public Passenger(int flightid,int passengerid,int numPassengers) {
        this.flightid = flightid;
        this.totalseats = 50;
        this.price = 5000;
        this.passengerid = passengerid;
        this.numPassengers = numPassengers;
    }
}