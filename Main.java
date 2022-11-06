import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"tires","keys"};
        Car nissan = new Car("Nissan",5000,2020,"Red",parts);

        String[] outsideVariable = nissan.getParts();
        outsideVariable[1]="Hello";

        System.out.println(Arrays.toString(nissan.getParts()));
        System.out.println(Arrays.toString(outsideVariable));


        /**
         * Applying the COPY CONSTRUCTOR :
         * The copy constructor copy the info from one object to another.
         * Syntax:
         * Class nameYourObject = new Class(ObjectYouWantCopyHere)
         */


        Car nissan2 = new Car(nissan);

        nissan2.setParts(new String[] {"tires","filter"}); // return new String[] {""}
        System.out.println(Arrays.toString(nissan2.getParts()));

        Car dodge = new Car("Dodge",11000,2019,"Blue",parts);

        // using setters:
        nissan.setColor("Black");
        double newPrice= nissan.getPrice()/2;
        nissan.setPrice(newPrice);

        // Using getters
        //System.out.println(nissan.getColor());

        //System.out.println(Arrays.toString(nissan.parts));


        /**

         // Using actions
         nissan.drive();
         dodge.drive();

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                " .It was built in "+ nissan.getYear() + " . It is "+ nissan.getColor()+ "\n");

        System.out.println("This nissan2 " + nissan2.getMake() + " is worth $" + nissan2.getPrice() +
                " .It was built in "+ nissan2.getYear() + " . It is "+ nissan2.getColor()+ "\n");

        */

        /**
        Car dodge = new Car("Dodge",11000,2019,"Blue");
        dodge.setColor("Blacky");
        double newPriceTwo = dodge.getPrice()/2;
        dodge.setPrice(newPriceTwo);


        dodge.make = "Dodge";
        dodge.price=11000;
        dodge.year = 2019;
        dodge.color = "blue";

         System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
         " .It was built in "+ dodge.getYear() + " . It is "+ dodge.getColor()+ "\n");
        */


    }
}