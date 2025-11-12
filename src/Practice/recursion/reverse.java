package Practice.recursion;

public class reverse
{
    public static void main(String[] args)
    {

        System.out.println(rev(1234,0));

    }
    public static int rev(int num,int reve)
    {
        if(num==0)
        {
            System.out.print(reve);
            return reve;
        }

        reve=(reve*10)+(num%10);

        return rev(num/10,reve);



    }
}
