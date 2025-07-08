package Practice.Strings;

import java.util.Scanner;

public class ReverseWords
{
    public static void main(String[] args) {
        System.out.println(reverse("Hello   Coder "));
    }
    public static String reverse(String str)
    {
        String[] arr=str.split(" ");
        StringBuilder res= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].isEmpty())
            {
                continue;
            }
            else
            {
                if(res.isEmpty())
                {
                    res.append(arr[i]);
                }
                else
                {
                    res.append(" ").append(arr[i]);
                }
            }
        }
        return res.toString();

    }
}
