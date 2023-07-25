package People;

public class Passenger implements IBook {

    private static int passengerCount = 0;
    String name;
    String email;
    int id;

    boolean running;


    public Passenger(){
        this.name = "";
        this.email= "";
        this.id = ++passengerCount;
        this.running= false;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public String start() {
        this.running =true;
        return "Welcome, " ;
    }


    public String promptForName() {
        return "What is your name?";
    }

    public String promptForEmail() {
        return "What is your email? ";
    }
    @Override
    public String promptForDestination() {
        return "Where do you want to go?";
    }

    public void processName(String name) {
        this.name =name;

    }
    public void processEmail(String email){
        this.email=email;
    }
//    @Override
//    public String processDestination(String inputDestination) throws Exception {
//        if (inputDestination = )
//
//        return null;
//    }

//    @Override
//    public Flight displayAllFlights() {
//        return null;
//    }
}
