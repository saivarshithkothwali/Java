package Practice.Basics;

public class PrimeOptimal
{
    public static void main(String[] args) {

        System.out.println(checkPrime(6));
    }
    public static boolean checkPrime(int num)
    {
        int count=0;
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
                if(num/i!=i)
                    count++;
            }

        }
        if(count==2)
            return true;
        else
            return false;
    }
}
