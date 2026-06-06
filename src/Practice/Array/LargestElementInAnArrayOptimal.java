package Practice.Array;

public class LargestElementInAnArrayOptimal
{
    public static void main(String[] args) {
        int[] arr={};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr)
    {
        if(arr.length==0)
        {
            throw new IllegalArgumentException("Array is empty");
        }

        //int max=Integer.MIN_VALUE;
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
