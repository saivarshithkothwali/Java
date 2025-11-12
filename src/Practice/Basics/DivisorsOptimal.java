package Practice.Basics;


import java.util.ArrayList;
import java.util.List;

public class DivisorsOptimal
{
    public static void main(String[] args)
    {
        System.out.println(printDivisors(12));
    }
    public static List<Integer> printDivisors(int num)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                list1.add(i);
                if(num/i!=i)
                {
                    list2.add(0,num/i);
                }
            }
        }
        list1.addAll(list2);
        return list1;

    }
}
