package Practice.BinarySearch;

public class Floor
{
    public static void main(String[] args)
    {
        int[] arr={5,10,15,20,25};
        System.out.println(floorOfANumber(arr,27));
    }
    public static int floorOfANumber(int[] arr,int target)
    {
        int floor=-1;

        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]<=target)
            {
                floor=arr[mid];
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return floor;
    }
}
