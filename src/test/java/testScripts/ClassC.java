package testScripts;

public class ClassC extends ClassB{
    //This is for competency details
    String techCompetency;

    public  static void main(String[] args)
    {
        // Default Constructor so there is no need for super keyword to call implicitly
        ClassC c = new ClassC();
        c.name= "Srikant";
        c.age=29;
        c.empId=3110;
        c.techCompetency="Quality Engineering";

        System.out.println(c.name+" age "+c.age+" employeeId "+c.empId+" from "+c.techCompetency);
    }
}


