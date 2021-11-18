package pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class petTest {

     @Test

       public void testGetName() {
       pet camel = new pet( "Xuseen", 34);
         String petName = camel.getName();
         int petAge = camel.getAge();

         assertEquals( "Xuseen", petName);
         assertEquals( 34, petAge);
  }

}
