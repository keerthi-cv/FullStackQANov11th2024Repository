package Abstractionassignment;
abstract class AbstractClass3
{
    AbstractClass3()
    {
        System.out.println("No-argument constructor of AbstractClass");
    }

    AbstractClass3(String message)
    {
        System.out.println("Single-argument constructor of AbstractClass: " + message);
    }

    AbstractClass3(int number, String message)
    {
        System.out.println("Two-argument constructor of AbstractClass: Number = " + number + ", Message = " + message);
    }
    abstract void display();
}

class ConcreteClass3 extends AbstractClass3
{
    ConcreteClass3()
    {
        super();
    }

    ConcreteClass3(String message)
    {
        super(message);
    }

    ConcreteClass3(int number, String message)
    {
        super(number, message);
    }
    void display()
    {
        System.out.println("ConcreteClass display method");
    }
}

public class Abstractconstructoroverloading
{
    public static void main(String[] args)
    {
        ConcreteClass3 obj1 = new ConcreteClass3();
        ConcreteClass3 obj2 = new ConcreteClass3("Hello");
        ConcreteClass3 obj3 = new ConcreteClass3(42, "Hello World");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}

