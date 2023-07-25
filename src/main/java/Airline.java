import java.util.ArrayList;

public class Airline {

    private String name;
    ArrayList<Flight> flights;


    public Airline(String name){
        this.flights = new ArrayList<>();
    }

    // getter array
    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    public ArrayList<String> getDestinations() {
        ArrayList<String> destinations = new ArrayList<>();
        for (Flight flight : this.flights) {
            destinations.add(flight.getDestination());
        }
        return destinations;
    }

    public void addFlight(Flight newFlight){
        this.flights.add(newFlight);
    }

    public void removeFlight(Flight oldFlight){
        this.flights.add(oldFlight);
    }


}
