package Practice.BinarySearch;
import java.util.Scanner;

public class SearchInROtatedSortedArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the values into the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        System.out.println(search(arr,1));
    }
    public static int search(int[] arr,int target)
    {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[s]<=arr[mid])
            {
                if(arr[s]<=target && target<=arr[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && target<=arr[e])
                {
                    s=mid+1;
                }
                else {
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}
