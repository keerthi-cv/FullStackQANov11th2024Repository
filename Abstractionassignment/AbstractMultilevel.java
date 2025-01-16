package Abstractionassignment;
abstract class Animal
{
    abstract void sound();
    void sleep()
    {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class Bulldog extends Dog
{
    void sound()
    {
        System.out.println("Bulldog growls");
    }
}

public class AbstractMultilevel
{
    public static void main(String[] args)
    {
        Bulldog bulldog = new Bulldog();
        bulldog.sound();
        bulldog.sleep();
    }
}


