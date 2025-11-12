package Practice.slidingWindow;

import java.util.HashMap;

public class FruitsIntoBasketBetter
{
    public static void main(String[] args) {
        int[] fruits={1,2,2,3,4,1};
        System.out.println(maxFruits(fruits));
    }
    public static int maxFruits(int[] fruits)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int maxLen=0;
        while(r<fruits.length)
        {
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            if(map.size()<=2)
            {
                maxLen=Math.max(maxLen,r-l+1);
            }
            else//map.size()>2
            {
                while(map.size()>2)
                {
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0)
                    {
                        map.remove(fruits[l]);
                    }
                    l++;
                }

            }
            r++;

        }
        return maxLen;
    }

}
