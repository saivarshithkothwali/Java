package Practice.slidingWindow;

import java.util.Scanner;

public class longestSubarraywithSumLessThanorqtoK
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();

        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();

        }



        System.out.println(longest(arr,k));

    }
    public static int longest(int[] arr,int k)
    {
        int maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum<=k)
                {
                    maxLen=Math.max(maxLen,j-i+1);
                }
                else
                    break;
            }

        }
        return maxLen;
    }
}
