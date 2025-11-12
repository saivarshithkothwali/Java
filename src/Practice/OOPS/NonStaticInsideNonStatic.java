package Practice.OOPS;

public class NonStaticInsideNonStatic
{
    public static void main(String[] args)
    {
        NonStaticInsideNonStatic obj=new NonStaticInsideNonStatic();
        obj.greeting();
    }
    void greeting()
    {
        greeting1();
        System.out.println("Hello world from greeting");
    }
    void greeting1()
    {
        System.out.println("Hello world from greeting1");
    }

}
