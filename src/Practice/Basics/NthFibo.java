package Practice.Basics;

public class NthFibo
{
    public static void main(String[] args) {

        System.out.println(fibo(7));
    }
    static int fibo(int n)
    {
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++)
        {
            c=a+b;

            a=b;
            b=c;
        }
        return a;
    }
}
