package testScripts;

public class EncapsulationTestClass {


    public static void main(String[] args) {


        Encapsulation ep = new Encapsulation();
        ep.setCustomerName("Srikant");
        ep.setPhone("8054405855");
        ep.setAge(29);

        System.out.println(ep.getCustomerName()+ ep.getPhone()+ ep.getAge());
    }
}