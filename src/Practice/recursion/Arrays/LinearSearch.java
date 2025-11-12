package Practice.recursion.Arrays;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr={3,2,1,18,9,87};
        int target=100;
        System.out.println(LS(arr,target,0));
    }
    public static boolean LS(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || LS(arr,target,index+1);
    }
}
