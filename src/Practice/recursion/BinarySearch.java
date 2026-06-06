package Practice.recursion;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr={1,3,7,9,55,69,98};
        System.out.println(search(arr,98,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return search(arr,target,0,mid-1);
        }
        return search(arr,target,mid+1,e);
    }
}
