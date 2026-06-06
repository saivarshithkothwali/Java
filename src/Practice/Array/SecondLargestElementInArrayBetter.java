package Practice.Array;

public class SecondLargestElementInArrayBetter
{
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr)
    {
        int largest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }

        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<largest && arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE)
        {
            return -1;
        }
        return secondLargest;
    }
}
