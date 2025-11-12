package Practice.BinarySearch;

public class NthRootOfMBrute
{
    public static void main(String[] args)
    {
        System.out.println(nthRoot(16,2));
    }

    public static int nthRoot(int m,int n)
    {
        for(int i=1;i<=m;i++)
        {
            int mul=1;
            for(int j=1;j<=n;j++)
            {
                mul=mul*i;
                if(mul>m)
                    break;
            }
            if(mul==m)
                return i;
        }
        return -1;

    }

}

