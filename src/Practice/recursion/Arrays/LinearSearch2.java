package Practice.recursion.Arrays;

public class LinearSearch2
{
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        int target=2;
        System.out.println(LS(arr,target,arr.length-1));
    }
    public static int LS(int[] arr,int target,int index)
    {
        if(index==-1)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return LS(arr,target,index-1);
    }
}
