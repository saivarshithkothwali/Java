package Practice.Array;

public class RemoveDuplicatesFromSortedArrayOptimal
{
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(arr));
    }
    public static int remove(int[] arr)
    {
        if(arr.length<2)
        {
            return arr.length;
        }
        int i=0,j=1;

        while(j<arr.length)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }

            j++;

        }
        return i+1;


    }
}
