package testScripts;

public class Employee extends Person{
 int empId;

 public void OfficeWork(String work)
 {
     System.out.println("Work is "+work);
 }

    public Employee(int age, String name,int empId) {
        super(age, name);
        this.empId=empId;
    }
}
