import java.util.Arrays;
import java.util.Random;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name=name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;
    }

    /**
     * This is a copy constructor
     * */
    public Person(Person source){
        this.name=source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    // Setters

    public void setName(String name){
        this.name=name;
    }

    public void setNationality(String nationality){
        this.nationality=nationality;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber=seatNumber;
    }


    // Actions:

    public void applyPassport(){
        Random random = new Random();
        int number = random.nextInt(2);

        if(number!=0){
            System.out.println("Congratulations, " + this.name + " " + " your passport was approved");
        }else{
            System.out.println("Sorry, " + this.name + " " + "we can not process your application");
        }
    }

    public void chooseSeat(){
        Random random = new Random();
        int number = random.nextInt(11);
        System.out.println("Your seat number is: " + number);
        this.seatNumber = number;
    }

    public String toString() {
        return "Name: " + this.name + "\n"
                +  "Nationality: " + this.nationality + "\n"
                +  "Date of Birth: " + this.dateOfBirth + "\n"
                +  "Seat Number: " + this.seatNumber + "\n"
                +  "Passport: " + Arrays.toString(this.passport) + "\n";
    }


}
