package Practice.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords
{
    public static void main(String[] args) {
        System.out.println(reverse("  Hello   Coder "));
    }
    public static String reverse(String str)
    {
        String[] arr=str.split(" ");

        //String ans="";
        StringBuilder ans=new StringBuilder();

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].length()!=0)
            {
                if(ans.isEmpty())
                {
                    //ans=ans+arr[i];
                    ans.append(arr[i]);
                }
                else
                {
//                    ans=ans+" ";
//                    ans=ans+arr[i];
                    ans.append(" ");
                    ans.append(arr[i]);
                }
            }
        }
        return ans.toString();


    }
}
