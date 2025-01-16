package Abstractionassignment;
abstract class AbstractClass {
    {
        System.out.println("Instance block in AbstractClass executed.");
    }
}
class SubClass extends AbstractClass {
    SubClass()
    {
        System.out.println("SubClass Constructor executed.");
    }
}
public class AbstractInstanceblock {
    public static void main(String[] args)
    {
        SubClass obj = new SubClass();
    }
}

