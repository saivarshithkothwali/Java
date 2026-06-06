package Practice.tcs;
import java.util.*;
import java.io.*;
public class practice
{
    public static void main(String[] args)
    {
        int[][] activities={{1,2},{3,4},{0,6},{5,7},{8,9}};
        System.out.println(maxActivitiesWithoutOverlapping(activities));
    }
    public static int maxActivitiesWithoutOverlapping(int[][] activities)
    {
        Arrays.sort(activities,(a,b)->(a[0]-b[0]));
        int activity=1;

        int i=0,j=1;
        while(j<activities.length)
        {
            int cs=activities[i][0];
            int ce=activities[i][1];
            int ns=activities[j][0];
            int ne=activities[j][1];

            if(ce<=ns)
            {
                activity++;
                i=j;
                j++;
            }
            else//ce>ns
            {
                if(ne>=ce)
                {
                    j++;
                }
                else
                {
                    i=j;
                    j++;
                }
            }
        }
        return activity;
    }
}
