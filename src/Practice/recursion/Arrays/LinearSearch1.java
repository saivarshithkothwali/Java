package Practice.recursion.Arrays;

public class LinearSearch1
{
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        int target=18;
        System.out.println(LS(arr,target,0));
    }
    public static int LS(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return LS(arr,target,index+1);
    }
}
