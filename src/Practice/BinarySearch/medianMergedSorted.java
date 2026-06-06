package Practice.BinarySearch;

public class medianMergedSorted
{
    public static void main(String[] args)
    {
        int[] arr1={1,3,4,7,10};
        int[] arr2={2,3,6};
        System.out.println(median(arr1,arr2));
    }
    public static double median(int[] arr1,int[] arr2)
    {
        int m=arr1.length;
        int n=arr2.length;

        int mid1=(m+n)/2;
        int mid2=mid1-1;

        int count=0;
        int first=0,second=0;
        int i=0,j=0;

        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                if(count==mid1)
                {
                    first=mid1;
                }
                if(count==mid2)
                {
                    second=mid2;
                }

                i++;
            }
            else
            {
                if(count==mid1)
                {
                    first=mid1;
                }
                if(count==mid2)
                {
                    second=mid2;
                }

                j++;
            }
            count++;
        }

        while(i<m)
        {
            if(count==mid1)
            {
                first=mid1;
            }
            if(count==mid2)
            {
                second=mid2;
            }
            i++;
            count++;

        }

        while(j<n)
        {
            if(count==mid1)
            {
                first=mid1;
            }
            if(count==mid2)
            {
                second=mid2;
            }
            j++;
            count++;
        }

        if((m+n)%2==0)
        {
            return (first+second)/2.0;
        }
        else
        {
            return first;
        }
    }
}
