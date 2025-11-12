package Practice.OOPS;

public class NonStaticInsideStatic
{
    public static void main(String[] args)
    {
        NonStaticInsideStatic obj=new NonStaticInsideStatic();
        obj.greeting();
    }

    void greeting()
    {

        System.out.println("Hello world");
    }
}
