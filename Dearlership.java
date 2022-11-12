import java.util.Arrays;

public class Dearlership {
    // Creating an array object to store different cars
    private Car[] cars; // it is empty for the moment

    // Creating a constructor with empty parameters.
    public Dearlership(){
        this.cars = new Car[3];
        //System.out.println(Arrays.toString(this.cars));
    }

    // Adding a getter, this getter has access to the class Car, and it will return an car object.
    // but you need to pass a specific index to return one specific car
    public Car getCar(int index){
        // we have to return a copy of the object
        return new Car(this.cars[index]);
    }

    // Adding the setter: This setter updates only 1 object and let the user choose which index to update
    public void setCar(Car car, int index){

        //Updating the cars array, and passing a car object using the constructor "copy source" in Car Class.
        this.cars[index] = new Car(car);
    }

}
