package pet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class petTest {

     @Test

       public void testGetName() {
         //arrange
       pet camel = new pet( "Xuseen", 34, "brown");
          //act
         String petName = camel.getName();
         String petColor = camel.getColor();
              int petAge =     camel.getAge();

          //Assert
         assertEquals( "Xuseen", petName);
         assertEquals( 34, petAge);
         assertEquals( "brown", petColor);


           }
           @Test
    public void testLong(){

         //arrange
               String testdata = "xuseen";

               pet camel = new pet(testdata);

               //act

             String expected = camel.getName();

               ///Aasert

                String acual ="xuseen";
                assertEquals(expected , acual);
           }


}
