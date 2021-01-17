package testScripts;

import java.security.PublicKey;

public class Bhindi extends GeneralizedClass{

    private static Object Bhindi;
    private static Object GeneralizedClass;

    public void prepareMasalaBhindi()
    {
        System.out.println("Masala Bhindi is prepared");
    }

    // Method Overriding
    public void wash()
    {
        System.out.println("Wash Bhindi");
    }

    public static void main(String[] args) {
        // Upcasting= Refering the object of specialized class using the reference of generalized class
        GeneralizedClass gc = new Bhindi();
        gc.color = "Green";
        gc.price = 120;
        gc.wash();
        // downcasting= Process of storing the current value present in the reference of generalized class into the reference of specialized class along with cast operator.

            Bhindi b = (Bhindi) gc;

            b.prepareMasalaBhindi();

    }
}

//Thursday
//Singleton>>Interface>>Abstract Class>>Encapsulation>>Abstraction>>Exception Handling

//Friday-Saturday
//Strings>>>Collections

//Sunday
//Selenium