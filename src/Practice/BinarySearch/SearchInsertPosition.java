package Practice.BinarySearch;

public class SearchInsertPosition
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(position(arr,10));
    }
    public static int position(int[] arr,int el)
    {
        int s=0,e=arr.length-1;
        int insertPos=arr.length;

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]>=el)
            {
                insertPos=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return insertPos;
    }
}
