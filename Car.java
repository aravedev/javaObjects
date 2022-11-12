import java.util.Arrays;

public class Car {

    // Fields are private, the only way to use it , is with getters and setters
   private String make;
    private double price;
    private int year;
    private String color;

    private String[] parts;



    // Creating a constructor:
    // the constructor syntax is: public or private NameYourClass(your info here){}
    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price=price;
        this.year=year;
        this.color=color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // Copy constructor: Copy a constructor previously created. This is used to copy objects
    public Car(Car source){
        this.make = source.make;
        this.price=source.price;
        this.color = source.color;
        this.year= source.year;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);

    }

    /*
     what is a getter? It is a method that returns a copy of the field's value, it doesnt matter
     if by mistake we delete the copy of our variable, because the original one will be working withou errors.

     Syntax of getter: property could be String, int, double, etc..
     public Property Name {
        return this.brand
     }
    */

    public String getMake(){
        return this.make;
    }

    public double getPrice(){
        return this.price;
    }

    public int getYear(){
        return this.year;
    }

    public String getColor(){
        return this.color;
    }

    public String[] getParts(){
        /**You must return a copy of the array not directly this.parts,
         * the problem is that if you return directly this.parts, you are returning
         * the reference (address) so, the user will get access and he can modify
         * the parameter, is like when one object copy other one and both share the same address in memory.
         *
         * Arrays.copyOf(arrayToCopy, arrayToCopy.length);
         */
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    /*
    * Setters is a method that update a field value
    * Syntax:
    * public void setMake(String yourParameter){
    * this.make = make;
    * }
    * */

    public void setMake(String make){
        this.make = make;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setYear(int year){
        this.year= year;
    }
    public void setColor(String color){
        this.color=color;
    }

    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // Actions

    public void drive(){
        System.out.println("You bought a beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price +" .");
        System.out.println("Please drive safely");
    }

    public String toString(){
        return "Make: " + this.make + ".\n"+
                "Price: " + this.price +".\n"+
                "Year: " + this.year +".\n"+
                "Color: " + this.color +".\n"+
                "Parts: " + Arrays.toString(parts) + ".\n";

    }
}
