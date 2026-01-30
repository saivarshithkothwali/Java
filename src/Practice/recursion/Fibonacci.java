package Practice.recursion;

public class Fibonacci
{
    public static void main(String[] args) {
        System.out.println(fib(3));

    }
    static int fib(int n)
    {
        if(n<2)
            return n;

        int left=fib(n-1);
        int right=fib(n-2);
        int sum=left+right;

        return sum;
    }
}
