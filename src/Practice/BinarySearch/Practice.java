package Practice.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        //System.out.println(str);

        String[] strArray=str.split(",");

        System.out.println(Arrays.toString(strArray));
        int[] arr=new int[strArray.length];
        for(int i=0;i<strArray.length;i++)
        {
            arr[i]=Integer.parseInt(strArray[i]);
        }

        int low=0,mid=0,high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,high,mid);
                high--;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                System.out.print(arr[i]+",");
            }
            else
            {
                System.out.print(arr[i]);
            }


        }
        //System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr,int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }



}
