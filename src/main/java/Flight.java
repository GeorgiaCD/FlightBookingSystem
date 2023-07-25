import People.Passenger;

import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private String destination;
    private int id;
    private ArrayList<Passenger> passengers;

    public Flight(String destination){
        Random rand = new Random();
        this.id = rand.nextInt(1000, 5000);
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }


    public void addPassenger(Passenger newPassenger){
        this.passengers.add(newPassenger);
    }

    public void removePassenger(Passenger oldPassenger){
        this.passengers.remove(oldPassenger);
    }


}
