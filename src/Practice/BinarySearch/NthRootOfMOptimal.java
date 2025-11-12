package Practice.BinarySearch;

public class NthRootOfMOptimal
{
    public static void main(String[] args) {
        System.out.println(root(27,3));
    }
    public static int root(int m,int n)
    {
        int s=1;
        int e=m;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(func(mid,n,m)==1)
                return mid;
            else if(func(mid,n,m)==2)
            {
                e=mid-1;

            }
            else
            {
                s=mid+1;
            }
        }
        return -1;
    }
    public static int func(int base,int pow,int m)
    {
        long result=1;
        for(int i=1;i<=pow;i++)
        {
            result=result*base;
            if(result>m)
                return 2;
        }
        if(result==m)
            return 1;
        return -1;
    }
}
