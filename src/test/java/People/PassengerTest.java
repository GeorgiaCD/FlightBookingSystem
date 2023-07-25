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
    Tim = new Passenger();
    Tam = new Passenger();
    Lucy = new Passenger();
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
      assertEquals(1, Tim.getId());
   }
}