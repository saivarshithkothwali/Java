package Practice.recursion.Arrays;

public class SortedOrNot
{
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8,9,11,24};
        System.out.println(checkSortedOrNot(arr));
    }
    public static boolean checkSortedOrNot(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
            else
                return false;
        }
        return true;
    }
}
