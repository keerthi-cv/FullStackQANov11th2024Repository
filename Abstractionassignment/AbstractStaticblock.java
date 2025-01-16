package Abstractionassignment;
abstract class wildAnimal
{
    static
    {
        System.out.println("its a static block & these are wild animals");
    }
    abstract void display();
}
class animal extends wildAnimal
{
    void display()
    {
        System.out.println("its a sub class block");
    }
}

public class AbstractStaticblock {
    public static void main(String[] args)
    {
        wildAnimal w = new animal();
        w.display();
    }
}
