package testScripts;

public class Test2 extends Test{

        final String college="LPU";
        int reg;
        String name;
        String phone;



    public static void  main(String[] args)
    {
        Test2 t2= new Test2();
        t2.name="Srikant";
        t2.reg=11106406;
        t2.phone="8054405855";

        Test2 t3= new Test2();
        t3.name="Abhishek";
        t3.reg=11106408;
        t3.phone="8054405800";

        System.out.println("Student Name is "+t2.name+" registration no is "+t2.reg+" college is "+ t2.college);
        System.out.println("Student Name is "+t3.name+" registration no is "+t3.reg+" college is "+ t3.college);

    }
}
