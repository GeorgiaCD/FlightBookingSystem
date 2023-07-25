public interface IBook {

    boolean isRunning();
    String start();
    String promptForName();
    String promptForEmail();
    String promptForDestination();
    String processDestination(String inputDestination, Airline airline) throws Exception;
//    Flight displayAllFlights();

}
