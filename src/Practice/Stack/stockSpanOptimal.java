package Practice.Stack;

import java.util.Arrays;
import java.util.Stack;

public class stockSpanOptimal
{
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(span(arr)));
    }
    public static int[] span(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {


            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {

                st.pop();
            }


            if(st.isEmpty())
            {

                st.push(i);
                ans[i]=i+1;
            }
            else
            {

                ans[i]=i-st.peek();
                st.push(i);
            }
        }
        return ans;
    }
}
