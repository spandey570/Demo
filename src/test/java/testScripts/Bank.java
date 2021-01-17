package testScripts;

public abstract class Bank {


    // Hiding the implementation from end user is called abstraction
    //Abstract Class can have abstract or non abstract method.
    //Partial Abstraction will be achieved with abstract class
    //Can't Object of abstract class
    // Static , Non Static & final variables can be declared

    int amount=1000;
    final int rate=5;
    static int SI=10;

    public abstract void loan();

    public void credit()
    {
        System.out.println("Credit Method");
    }

}
