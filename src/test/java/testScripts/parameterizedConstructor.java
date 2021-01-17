package testScripts;

public class parameterizedConstructor {
    String name;
    int age;
    String city;

    public parameterizedConstructor(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public static void main(String[] args)
    {
        parameterizedConstructor pc= new parameterizedConstructor("Srikant",29,"Kanpur");
        System.out.println(pc.name);
        System.out.println(pc.age);
        System.out.println(pc.city);
    }
}
