public class Main {

    public static void main(String[] args) {

        //• Write a static main method that creates two objects, one with the default constructor and the other with the
//  constructor with parameters. Give sample data for the parameters.

        VehicleChassis mychas1 = new VehicleChassis();
        VehicleChassis mychas2 = new VehicleChassis("testname");

        System.out.println(mychas1.toString());
        System.out.println(mychas2.toString());
        mychas1.setChassisType("set test");
        System.out.println(mychas1.getChassisType());



    }
}
