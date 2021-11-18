package pet;

public class pet {
 private String name;
 private int age;
  private  String color;


   public pet(String petName ,int petAge, String petColor){
       name = petName;
       age = petAge;
       color = petColor;

   }

    public pet(String testdata) {

    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }


}
