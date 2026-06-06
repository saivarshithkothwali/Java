package Practice.Array;

public class majorityElement
{
    public static void main(String[] args) {
        int[] arr={2,2,1,3,1,2,2};
        System.out.println(majority(arr));
    }
    public static int majority(int[] arr)
    {
        int count=0,el=0;

        for(int i=0;i<arr.length;i++)
        {
            if(count==0 && el!=arr[i])
            {
                count++;
                el=arr[i];
            }
            else if(el==arr[i])
            {
                count++;
            }
            else if(el!=arr[i])
            {
                count--;
                if(count==0)
                {
                    el=arr[i];
                    count++;
                }
            }
        }
        return el;
    }
}
