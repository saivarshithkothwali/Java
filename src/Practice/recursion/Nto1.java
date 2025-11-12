package Practice.recursion;

public class Nto1
{
    public static void main(String[] args) {
        function(5);
    }
    public static void function(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        function(n-1);
    }
}
