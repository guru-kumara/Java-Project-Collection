import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Booking {  
    public static void booktaxi(int id, char from, char to, int time, List<Taxi> taxis) {
        int min=999;
        int disbtpianddrop=0;
        Taxi bookedTaxi = null;
        int earning = 0;
        int nextfreetime = 0;
        String tripdetails = "";
        char nextspot = 'Z';

        for(Taxi t:taxis)
        {
            int disbtcusandtaxi=Math.abs((t.currentspot-'0')-(from-'0'))*15;
            if(disbtcusandtaxi<min)
            {
                bookedTaxi = t;
                disbtpianddrop = Math.abs((to-'0')-(from-'0'))*15;
                earning=(disbtpianddrop-5)*10+100;
                int droptime=time+disbtpianddrop/15;
                nextfreetime = droptime;

                nextspot = to;
                tripdetails = id + "  " + from + "  " + to + "  " + time + "  " + droptime + "  " + earning;
                
            }

        }
        bookedTaxi.setdetails(true, nextfreetime, bookedTaxi.totalearning + earning, tripdetails, nextspot);
        System.out.println("Taxi booked successfully!");
    }
    public static List<Taxi> createtaxi(int n) {
        List<Taxi> taxis = new ArrayList<Taxi>();
        for (int i = 0; i < n; i++) {
            Taxi t=new Taxi();
            taxis.add(t);
        }
        return taxis;
    }
    public static List<Taxi> getfreetaxi(List<Taxi> taxis, int time, char from) {
        List<Taxi> freetaxis = new ArrayList<Taxi>();
        for (Taxi t : taxis) {
            if(t.freetime<=time && ((Math.abs(t.currentspot-'0')-(from-'0'))<=time-t.freetime))
            {
                freetaxis.add(t);
            }
        }
        return freetaxis;
    }
    public static void main(String[] args)
    {
        List<Taxi> taxis = createtaxi(4);
        Scanner sc = new Scanner(System.in);
        int id=1;
        boolean flag = true;
        while(flag){
        System.out.println("0: BOOK A TAXI");
        System.out.println("1: PRINT TAXI DETAILS");
        System.out.println("2: EXIT");

        int choice=sc.nextInt();
        switch (choice) {
            case 0:
                int CustomerID=id;
                System.out.println("Enter Pickup point");
                char from = sc.next().charAt(0);
                System.out.println("Enter Drop point");
                char to = sc.next().charAt(0);
                System.out.println("Enter pick up time");
                int time= sc.nextInt();
                if(from<'A' || from>'D' || to<'A' || to>'D') {
                    System.out.println("Invalid pickup or drop point. Please enter a valid point (A, B, C, D).");
                    continue;
                }
                List<Taxi> freetaxi=getfreetaxi(taxis,time,from);
                if(freetaxi.size()==0) {
                    System.out.println("No free taxi available at this time.");
                    continue;
                }
                Collections.sort(freetaxi, (a, b) -> a.totalearning - b.totalearning);
                booktaxi(id,from,to,time,freetaxi);
                id++;
                break;
            case 1:
                System.out.println("Printing taxi details...");
                for (Taxi taxi : taxis) {
                    taxi.printdetail();
                }
                break;
            case 2:
                flag = false;
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}

