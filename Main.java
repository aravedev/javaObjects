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

        // Creating an array of objects with cars
        Car[] cars = new Car[]{
                new Car("Nissan",5000,2020,"Red",parts),
                new Car("Dodge",11000,2019,"Blue",parts),
                new Car("Nissan",5000,2020,"yellow", new String[]{"tires","filter"})
        };


       // System.out.println(nissan);

        Dearlership dearlership = new Dearlership();

        for (int i = 0; i < cars.length; i++) {
            dearlership.setCar(cars[i],i);
        }

        // Creating a copy of the previous object inside the dealership class "private Car[] cars;"
        Car newCar = dearlership.getCar(0);
        newCar.setColor("Bluesshh");
        System.out.println(dearlership.getCar(0));
    }
}