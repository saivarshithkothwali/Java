package Practice.Basics;

public class factorila
{
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    public static int fact(int num)
    {
        if(num==0 || num==1)
            return 1;
        int prod=1;
        for(int i=1;i<=num;i++)
        {
            prod=prod*i;
        }
        return prod;
    }
}



