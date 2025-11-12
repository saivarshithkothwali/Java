package Practice.OOPS;

public class StaticInsideNonStatic
{
    public static void main(String[] args)
    {
        StaticInsideNonStatic obj=new StaticInsideNonStatic();
        obj.greeting();
    }
    static void greeting1()
    {
        System.out.println("Hello world from greeting1");
    }
    void greeting()
    {
        greeting1();
        System.out.println("Hello world from greeting");
    }
}
