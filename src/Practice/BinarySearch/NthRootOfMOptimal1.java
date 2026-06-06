package Practice.BinarySearch;

public class NthRootOfMOptimal1
{
    public static void main(String[] args) {
        System.out.println(root(65,3));
    }

    public static int root(int m,int n)
    {
        int s=1;
        int e=m;

        while(s<=e)
        {
            int mid=s+(e-s)/2;



            if(Math.pow(mid,n)==m)
            {
                return mid;
            }

            else if(Math.pow(mid,n)>m)
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
}
