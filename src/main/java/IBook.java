public interface IBook {

    boolean isRunning();
    String start();
    String promptForDestination();
    String processDestination(String destination) throws Exception;
    Flight displayAllFlights();

}
