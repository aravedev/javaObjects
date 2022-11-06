public class PersonForm {
    public static void main(String[] args) {
        Person juan = new Person("Juan","Colombian","16/02/1974",7);

        /**
         * Applying copy constructor
         * */

        Person person2 = new Person(juan);

        /*
        juan.name = "Juan";
        juan.nationality="Colombian";
        juan.dateOfBirth="16/02/1974";
        juan.seatNumber=7;
        juan.passport = new String[]{juan.name, juan.nationality, juan.dateOfBirth };
        */
        System.out.println("Passenger Name: " + juan.getName()+"\n");
        System.out.println("Passenger Nationality: " + juan.getNationality()+"\n");
        System.out.println("Passenger Date of Birth: " + juan.getDateOfBirth()+"\n");
        System.out.println("Passenger Seat Number: " + juan.getSeatNumber()+"\n");

        System.out.println("Passenger Name person2: " + person2.getName()+"\n");
        System.out.println("Passenger Nationality: " + person2.getNationality()+"\n");
        System.out.println("Passenger Date of Birth: " + person2.getDateOfBirth()+"\n");
        System.out.println("Passenger Seat Number: " + person2.getSeatNumber()+"\n");

        System.out.println("Passenger applied for a passport");
        juan.applyPassport();
        juan.chooseSeat();
    }
}
