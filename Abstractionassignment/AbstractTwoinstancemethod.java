package Abstractionassignment;
abstract class AbstractClass2 {

    public void method1()
    {
        System.out.println("Method1 executed.");
    }

    public void method2()
    {
        System.out.println("Method2 executed.");
    }
}

class ConcreteClass extends AbstractClass2
{

}

public class AbstractTwoinstancemethod {
    public static void main(String[] args) {
        // Instantiate the concrete class
        ConcreteClass obj = new ConcreteClass();
        obj.method1();
        obj.method2();
    }
}



