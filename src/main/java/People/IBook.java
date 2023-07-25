package People;

public interface IBook {

    boolean isRunning();
    String start();
    String promptForName();
    String promptForEmail();
    String promptForDestination();
    String processDestination(String destination) throws Exception;
//    Flight displayAllFlights();
}
