package Practice.slidingWindow;

import java.util.HashSet;

public class FruitsIntoBasketBrute
{
    public static void main(String[] args) {
        int[] fruits={1,2,2,3,4,1};
        System.out.println(maxFruits(fruits));
    }
    public static int maxFruits(int[] fruits)
    {
        HashSet<Integer> set=new HashSet<>();
        int maxLen=0;
        for(int i=0;i<fruits.length;i++)
        {
            set.clear();
            for(int j=i;j<fruits.length;j++)
            {
                set.add(fruits[j]);
                if(set.size()<=2)
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
