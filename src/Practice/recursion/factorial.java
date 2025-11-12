package Practice.recursion;

public class factorial
{
    public static void main(String[] args)
    {
        System.out.println(fact(4));
    }
    public static int fact(int num)
    {
        if(num==1 || num==0)
            return 1;
        return num * fact(num-1);
    }
}
