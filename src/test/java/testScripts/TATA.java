package testScripts;

public class TATA implements Car{
    @Override
    public void startFunction() {
        System.out.println("TATA Start Function");
    }

    @Override
    public void endFunction() {
        System.out.println("TATA End Function");
    }

    @Override
    public void refuelFunction() {
        System.out.println("TATA Refuel Function");
    }

    public void safety()
    {
        System.out.println("TATA Safety Function");
    }
}
