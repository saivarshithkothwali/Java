package Practice.TwoPointerSlidingWindowPrefixSum;

public class MaximumPointsFromCards
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,1};
        System.out.println(maxPoints(arr,3));


    }
    public static int maxPoints(int[] arr,int k)
    {
        int points=arr[0];
        for(int i=1;i<k;i++)
        {
            points=points+arr[i];
        }

        int maxPoints=points;

        int left=k-1;
        int right=arr.length;

        while(left>=0)
        {
            points=points-arr[left];
            left--;
            right--;
            points=points+arr[right];


            maxPoints=Math.max(points,maxPoints);
        }
        return maxPoints;
    }
}
