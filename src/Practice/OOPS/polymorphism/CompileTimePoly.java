package Practice.OOPS.polymorphism;

public class CompileTimePoly
{
    int sum(int a,int b)
    {
        return a+b;
    }

    int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        CompileTimePoly obj=new CompileTimePoly();

        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));

        //obj.sum(1,2,3,4); //With this we can say that the which method to be called is decided just during the compile time
    }
}
