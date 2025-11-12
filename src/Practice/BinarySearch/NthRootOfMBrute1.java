package Practice.BinarySearch;

public class NthRootOfMBrute1
{
    public static void main(String[] args) {
        System.out.println(root(64,3));
    }
    public static int root(int m,int n)
    {
        for(int i=1;i<=m;i++)
        {
            double prod=Math.pow(i,n);

            if(prod==m)
                return i;
            else if(prod>m)
                break;

        }
        return -1;
    }
}
