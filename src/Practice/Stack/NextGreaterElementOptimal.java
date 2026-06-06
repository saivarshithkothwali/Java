package Practice.Stack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class NextGreaterElementOptimal
{
    public static void main(String[] args)
    {
        int[] arr={2,1,7,11,12,3,6,9};
        System.out.println(Arrays.toString(nge(arr)));
    }
    public static int[] nge(int[] arr)
    {
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty())
            {
                if(st.peek()<=arr[i])
                {
                    st.pop();
                }
                else
                {
                    ans[i]=st.peek();
                    st.push(arr[i]);
                    break;
                }
            }
            if(st.isEmpty())
            {
                ans[i]=-1;
                st.push(arr[i]);
            }
        }
        return ans;
    }
}
