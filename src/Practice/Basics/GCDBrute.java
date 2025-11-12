package Practice.Basics;

public class GCDBrute
{
    public static void main(String[] args) {

        System.out.println(GCD(20,40));
    }
    public static int GCD(int n1,int n2)
    {
        int minimum=Math.min(n1,n2);
        int gcd=1;
        for(int i=1;i<=minimum;i++)
        {

            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
}
