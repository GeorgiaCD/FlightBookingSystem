package People;

import java.util.concurrent.atomic.AtomicInteger;

public class Passenger {

    private static final AtomicInteger count = new AtomicInteger(0);
    String name;
    String email;
    int id;


    public Passenger(String name, String email){
        this.name =name;
        this.email=email;
        this.id = count.incrementAndGet();
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

}
