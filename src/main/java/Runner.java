import People.IBook;
import People.Passenger;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IBook book = new Passenger();

        System.out.println(book.start());
        while(book.isRunning()){
            System.out.println(book.promptForName());
            String name = scanner.nextLine();
            System.out.println(book.promptForEmail());
            String email = scanner.nextLine();

            System.out.println(book.promptForDestination());
            String inputDestination = scanner.nextLine();






        }




    }

}
