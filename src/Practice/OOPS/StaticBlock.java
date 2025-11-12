package Practice.OOPS;

public class StaticBlock
{
    public static void main(String[] args)
    {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a + " " +StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " " +StaticBlock.b);

        StaticBlock obj1=new StaticBlock();
        System.out.println(StaticBlock.a + " " +StaticBlock.b);

    }

    static int a=10;
    static int b;

    static{
        System.out.println("I am in static block");
        System.out.println("b=" +b);
        b=a*4;
    }


}
