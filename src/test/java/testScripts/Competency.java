package testScripts;

public class Competency extends Employee{
    String tech;
    public Competency(int age, String name, int empId, String tech) {
        super(age, name, empId);
        this.tech=tech;
    }

    public static void main(String[] args)
    {
        Competency tc= new Competency(29,"Srikant",3310,"QA");
        System.out.println(tc.name+" age "+tc.age+" employeeId "+tc.empId+" from "+tc.tech);
        tc.walk();
        tc.OfficeWork("QA");

    }
}
