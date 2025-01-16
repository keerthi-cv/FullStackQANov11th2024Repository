package Abstractionassignment;
abstract class AbstractClass1 {

    public static void staticMethod1()
    {
        System.out.println("Static Method 1 is executed.");
    }

    public static void staticMethod2()
    {
        System.out.println("Static Method 2 is executed.");
    }
}

public class AbstractTwostaticmethod {
    public static void main(String[] args)
    {

        AbstractClass1.staticMethod1();
        AbstractClass1.staticMethod2();
    }
}


