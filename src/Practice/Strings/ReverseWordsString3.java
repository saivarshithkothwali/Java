package Practice.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsString3
{
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);

        String str="sai varshith";
        System.out.println(reverse(str));
    }
    public static String reverse(String str)
    {
        char[] arr=str.toCharArray();

        //System.out.println(Arrays.toString(arr));

        int s=0,e=0;

        while(e<=arr.length)
        {
            while(e<arr.length && arr[e]!=' ' )
            {
                e++;
            }
            swap(arr,s,e-1);

            s=e+1;
            e=s;
        }

        return new String(arr);

    }
    public static void swap(char[] arr,int first,int last)
    {
        while(first<=last)
        {
            char temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

    }

}
