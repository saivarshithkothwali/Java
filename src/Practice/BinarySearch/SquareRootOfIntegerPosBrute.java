package Practice.BinarySearch;

public class SquareRootOfIntegerPosBrute
{
    public static void main(String[] args) {

        System.out.println(squareRoot(50000));
    }
    public static int squareRoot(long n)
    {
        int ans=0;
        for(int i=0;i<n;i++)
        {

            if((long)i*(long)i<=n)
            {
                ans=i;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
}
