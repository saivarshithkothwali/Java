package Practice.Basics;

public class GCDBetter
{
    public static void main(String[] args) {

        System.out.println(GCD(20,40));
    }
    public static int GCD(int n1,int n2)
    {
        int min=Math.min(n1,n2);
        int gcd=1;
        for(int i=min;i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd= i;
                break;
            }
        }
        return gcd;

    }
}
