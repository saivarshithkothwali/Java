package Practice.Basics;

import java.util.ArrayList;

public class DivisorsBrute
{
    public static void main(String[] args) {
        System.out.println(PrintDivisors(12));
    }
    public static ArrayList<Integer> PrintDivisors(int num)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                list.add(i);
            }
        }
        return list;
    }
}
