package Practice.recursion;

public class reverse
{
    public static void main(String[] args)
    {
        rev(0,0);

    }
    public static void rev(int num,int reve)
    {
        if(num==0)
        {
            System.out.print(reve);
            return;
        }

        reve=(reve*10)+(num%10);

        rev(num/10,reve);



    }
}
