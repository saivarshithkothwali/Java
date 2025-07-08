package Practice;

public class PatternsKunal
{
    public static void main(String[] args)
    {
        pattern33();
    }
    public static void pattern33()
    {
        int n=5;
        char ch='a';
        for(int i=0;i<n;i++)
        {

            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
                if(ch>=97)
                {
                    ch=(char)(ch-31);
                }
                else {
                    ch=(char)(ch+33);
                }



            }
            System.out.println();
        }
    }
}
