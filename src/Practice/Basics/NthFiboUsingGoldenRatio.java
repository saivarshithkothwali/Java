package Practice.Basics;

public class NthFiboUsingGoldenRatio
{
    public static void main(String[] args) {
//        for(int i=0;i<11;i++)
//        {
//            System.out.println(fib(i));
//        }
        System.out.println(fib(50));

    }
    public static long fib(int n)
    {
        return (long)((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
    }
}
