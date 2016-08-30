/**
 * Created by halleyfroeb on 8/29/16.
 */
// Stores a Dog's information

public class Dog {
    String name;
    int age;
    String gender;
    String breed;
    boolean isAlive;

    public Dog(String name, int age, String gender, String breed, boolean isAlive){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isAlive = isAlive;
    }

    public String getName (String name){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public int getAge (int age){
        return age;
    }
    public void setAge (int age){
        if(age > 0){
            this.age = age;
        }
    }

    public String genderUpperCase (String gender) {
        return gender;
    }
    public void setGender (String gender){
        this.gender = gender;
    }


    public String breedUpperCase (String breed){
        return breed;
    }
    public void setBreed (String breed) {
        this.breed = breed;
    }

    public boolean getIsAlive (boolean isAlive) {
        return isAlive;
    }
    public void setIsAlive (boolean isAlive){
        this.isAlive = isAlive;
    }

    public void apology (){
        if(isAlive != true){
            System.out.println("I'm sorry for your loss");
        }
    }
}
