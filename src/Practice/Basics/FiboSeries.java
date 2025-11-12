package Practice.Basics;

public class FiboSeries
{
    public static void main(String[] args) {
        fib(7);


    }
    static void fib(int n)
    {
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
