package Practice.BinarySearch;

public class SingleElementOptimal
{
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(single(arr));
    }
    public static int single(int[] arr)
    {
        if(arr.length==1)
        {
            return arr[0];
        }

        if(arr.length%2==0)
            return -1;

        if(arr[0]!=arr[1])
        {
            return arr[0];
        }

        if(arr[arr.length-1]!=arr[arr.length-2])
        {
            return arr[arr.length-1];
        }

        int s=1,e=arr.length-2;

        while(s<=e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }

//            if(mid%2==0)
//            {
//                if(arr[mid]==arr[mid+1])
//                {
//                    s=mid+1;
//                }
//                 else if(arr[mid]==arr[mid-1])
//                {
//                    e=mid-1;
//                }
//
//            }
//            if(mid%2==1)
//            {
//                if(arr[mid]==arr[mid-1])
//                {
//                    s=mid+1;
//                }
//                 else if(arr[mid]==arr[mid+1])
//                {
//                    e=mid-1;
//                }
//            }

            if((mid%2==0 && arr[mid]==arr[mid+1])  || (mid%2==1 && arr[mid]==arr[mid-1]))
            {
                s=mid+1;
            }
            else if((mid%2==0 && arr[mid]==arr[mid-1]) || (mid%2==1 && arr[mid]==arr[mid+1]))
            {
                e=mid-1;
            }
        }
        return -1;
    }
}
