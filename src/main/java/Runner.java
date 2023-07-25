import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IBook book = new Passenger();

        // Instantiated the airline
        Airline airline = new Airline("Heathrow");
        // Added new flights
        airline.addFlight(new Flight("Paris"));
        airline.addFlight(new Flight("London"));
        airline.addFlight(new Flight("Luton"));
        airline.addFlight(new Flight("Georgia"));

//        System.out.println(airline.getFlights());
//        System.out.println(airline.getDestinations());

        System.out.println(book.start());
        while(book.isRunning()){
            System.out.println(book.promptForName());
            String name = scanner.nextLine();

            System.out.println(book.promptForEmail());
            String email = scanner.nextLine();

            System.out.println(book.promptForDestination());
            String inputDestination = scanner.nextLine();

            try {
                System.out.println(book.processDestination(inputDestination, airline));
            } catch(Exception exception) {
                System.out.println("We do not have any flights going to " + inputDestination);
            }


        }




    }

}
