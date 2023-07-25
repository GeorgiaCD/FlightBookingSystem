package People;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

   Passenger Tim;
   Passenger Tam;
   Passenger Lucy;

 @BeforeEach
    void setUp() {
    Tim = new Passenger("Tim", "tim@email.com");
    Tam = new Passenger("Tam", "tam@gmail.com");
    Lucy = new Passenger("Lucy", "lucy@email.com");
    }

    @Test
    void getName() {
       assertThat(Tam.getName()).isEqualTo("Tam");
    }

    @Test
    void getEmail() {
       assertThat(Tim.getEmail()).isEqualTo("tim@email.com");
    }

    @Test
    void getId() {
       assertEquals(3,Lucy.getId());
    }

   @Test
   void getIdTim() {
      assertEquals(2, Tim.getId());
   }
}