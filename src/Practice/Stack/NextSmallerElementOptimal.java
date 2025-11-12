package Practice.Stack;

import java.util.Arrays;
import java.util.Stack;
public class NextSmallerElementOptimal
{
    public static void main(String[] args) {
        int[] arr={3,5,2,1,11,7,8};
        System.out.println(Arrays.toString(nse(arr)));
    }
    public static int[] nse(int[] arr)
    {
        int[] temp=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                temp[i]=-1;
                st.push(arr[i]);
            }
            else
            {
                temp[i]=st.peek();
                st.push(arr[i]);
            }
        }
        return temp;
    }
}
