package Practice;

public class Patterns
{
    public static void main(String[] args)
    {

        pattern20();

    }
    public static void pattern1()
    {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern2()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
    public static void pattern4()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern7()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int s=0;s<n-i-1;s++)
            {
                System.out.print(" ");
            }
                for(int j=0;j<(i*2)+1;j++)
                {
                    System.out.print("*");
                }
            for(int s=0;s<n-i-1;s++)
            {
                System.out.print(" ");
            }
            System.out.println();


        }
    }

    public static void pattern8()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int s=0;s<i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*n)-(2*i)-1;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<i;s++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern10()
    {
        int n=5;
        for(int i=0;i<2*n;i++)
        {
            if(i<5)
            {
                for(int j=0;j<i+1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            if(i>=5)
            {
                for(int j=0;j<2*n-i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public static void pattern11()
    {
        int n=5;
        int start=1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                start=1;
            }
            else
                start=0;
            for(int j=0;j<i+1;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();

        }


    }
    public static void pattern12()
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int s=0;s<(2*n)-(2*i);s++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern13()
    {
        int n=5;
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern14()
    {
        int n=5;

        for(int i=0;i<n;i++)
        {
            for(char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch+" ");


            }
            System.out.println();
        }
    }
    public static void pattern15()
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(char ch='A';ch<'A'+i;ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16()
    {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            ch=(char)(ch+1);
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);

            }

            System.out.println();
        }
    }
    public static void pattern17()
    {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int s=0;s<n-i-1;s++)
            {
                System.out.print(" ");
            }
            for(char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch);
            }
            for(char ch='A';ch<'A'+i;ch++)
            {
                System.out.print(ch);
            }
            for(int s=0;s<n-i-1;s++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern18()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int ch='E'-i;ch<='E';ch++)
            {
                System.out.print((char)ch);
            }
            System.out.println();
        }
    }
    public static void pattern19()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<i*2;s++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<(2*n)-(2*i);s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<2*n-2*i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int s=0;s<2*i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
