package Practice.BinarySearch;

public class SquareRootOfIntegerPosOptimal
{
    public static void main(String[] args) {
        System.out.println(
                squareRoot(28));
    }
    public static int squareRoot(int n)
    {
        int s=1;
        int e=n;
        int ans=0;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if((long)mid*(long)mid==n)
                return mid;
            else if((long)mid*(long)mid<n)
            {
                ans=mid;
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
}
