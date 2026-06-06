package Practice.Array;

public class SecondLargestElementInArrayOptimal
{
    public static void main(String[] args) {
        int[] arr={5,Integer.MIN_VALUE};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr)
    {
        if(arr.length<2)
        {
            return -1;
        }

        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
         boolean found =false;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                found=true;
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest)
            {
                found=true;
                secondLargest=arr[i];
            }
        }

        return found? secondLargest:-1;
    }
}
