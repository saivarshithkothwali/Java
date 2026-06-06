package Practice.BinarySearch2D;

import java.util.Arrays;

public class SearchInFullySortedMatrixOptimal
{
    public static void main(String[] args) {
        //Fully sorted matrix-Last element of row i < first element of row i+1
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=12;
        System.out.println(Arrays.toString(find(arr,target)));
    }
    public static int[] find(int[][] arr,int target)
    {

        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid][arr[0].length-1]<target)
            {
                s=mid+1;
            }
            else if(arr[mid][arr[0].length-1]>=target){
                e=mid-1;
            }
        }

        if(s >= arr.length || target < arr[s][0])
        {
            return new int[]{-1,-1};
        }

        int low=0,high=arr[s].length-1;

        while(low<=high)
        {
            int m=low+(high-low)/2;

            if(arr[s][m]==target)
            {
                return new int[] {s,m};
            }
            else if(arr[s][m]<target)
            {
                low=m+1;
            }
            else
            {
               high=m-1;
            }

        }
        return new int[] {-1,-1};
    }
}
