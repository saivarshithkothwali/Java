package Practice.tcs;

import java.util.Scanner;

public class MyFile
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

//        String input=sc.nextLine();
//
//        String[] inputArray=input.split("[, ]+");

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        avg(arr);
    }
    public static void avg(int[] arr)
    {
        int sum=0,count=0;
        float avg=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
                sum=sum+arr[i];
            }
        }
        avg=(float)sum/count;

        System.out.println(sum+" "+count+" "+avg);
    }
}
