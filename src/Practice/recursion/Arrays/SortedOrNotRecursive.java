package Practice.recursion.Arrays;

public class SortedOrNotRecursive
{
    public static void main(String[] args) {
        int[] arr={1,3,4,8,7,9};
        System.out.println(checkSortedOrNot(arr,0));
    }
    public static boolean checkSortedOrNot(int[] arr,int index)
    {
        if(index==arr.length-1)
            return true;

        return arr[index]<arr[index+1] && checkSortedOrNot(arr,index+1);
    }
}
