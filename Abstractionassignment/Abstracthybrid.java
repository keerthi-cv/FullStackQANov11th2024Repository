package Abstractionassignment;
abstract class grandfather4
{
    abstract void show();

    void showG(String GName)
    {
        System.out.println(GName+ " is a Grandfather");
    }
}
class Father4 extends grandfather4
{
    void show()
    {
        System.out.println("its a abstract method implementation");
    }
    void showF(String Fname)
    {
        System.out.println(Fname+ " is the father");
    }
}
class Father5 extends grandfather4
{
    void show()
    {
        System.out.println("its a abstract method implementation");
    }
    void showS(String sname)
    {
        System.out.println(sname+ " is the son");
    }
}
class Daughter extends Father5
{
    void showD(String Dname)
    {
        System.out.println(Dname+ " is the Daughter");
    }
}

public class Abstracthybrid
{
    public static void main(String[] args)
    {
        Daughter d1 = new Daughter();
        d1.show();
        Father5 f5 = new Father5();
        f5.show();
        f5.showS("sam");
        f5.showG("parmesh");
    }
}


