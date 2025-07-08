package Practice.slidingWindow;

import java.util.Scanner;

public class MaximumPointsFromCards
{
    public static void main(String[] args) {
        int[] arr=new int[9];
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<9;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<9;i++)
        {
            System.out.print(arr[i]+",");
        }

    }
}
