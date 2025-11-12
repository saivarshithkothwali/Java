package Practice.Strings;

import java.util.Scanner;

public class ReverseWordsString3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        System.out.println(reverse(str));
    }
    public static String reverse(String str)
    {
        char[] arr=str.toCharArray();

        int SI=0;

        for(int EI=0;EI<=arr.length;EI++)
        {
            if(EI==arr.length || arr[EI]==' ')
            {
                rev(SI,EI-1,arr);
                SI=EI+1;
            }
        }
        return new String(arr);
    }
    public static void rev(int SI,int EI,char[] arr)
    {
        while(SI<EI)
        {
            char temp=arr[SI];
            arr[SI]=arr[EI];
            arr[EI]=temp;
            SI++;
            EI--;
        }

    }

}
