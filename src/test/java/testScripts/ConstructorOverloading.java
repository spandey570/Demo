package testScripts;

public class ConstructorOverloading {
    String bookName;
    int price;
    String seller;

    ConstructorOverloading()
    {
        bookName="Book1";
        price=100;
        seller="Seller1";
    }

    ConstructorOverloading(String name)
    {
        bookName= name;
        price=200;
        seller="Seller2";
    }

    ConstructorOverloading(String name,int price)
    {
        bookName= name;
        this.price=price;
        seller="Seller3";
    }

    ConstructorOverloading(String name,int price,String seller)
    {
        bookName= name;
        this.price=price;
        this.seller=seller;
    }
    ConstructorOverloading(int price,String seller)
    {
        bookName= "Book5";
        this.price=price;
        this.seller=seller;
    }

    ConstructorOverloading(int price,String name,String seller)
    {
        bookName= name;
        this.price=price;
        this.seller=seller;
    }


    public static void main(String[] args)
    {
        ConstructorOverloading co= new ConstructorOverloading();
        System.out.println(co.bookName+" "+ co.price+" "+ co.seller);
        ConstructorOverloading co1= new  ConstructorOverloading("Book2");
        System.out.println(co1.bookName+" "+ co1.price+" "+ co1.seller);
        ConstructorOverloading co2= new ConstructorOverloading(500,"Seller5");
        System.out.println(co2.bookName+" "+ co2.price+" "+ co2.seller);
    }

}
