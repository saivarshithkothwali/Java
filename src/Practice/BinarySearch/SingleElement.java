package Practice.BinarySearch;

public class SingleElement
{
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        System.out.println(find(arr));

    }
    public static int find(int[] arr)
    {
        if(arr.length==1)
        {
            return arr[0];
        }

//        if(arr.length%2==0)
//        {
//            return -1;
//        }

        for(int i=1;i<arr.length;i=i+2)
        {
            if(arr[i]!=arr[i-1])
            {
                return arr[i-1];
            }
        }
        return arr[arr.length-1];
    }
}
