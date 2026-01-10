package Practice.recursion;

public class patterns
{
    public static void main(String[] args)
    {
        int n=3;
        pattern(4,0);
    }
    public static void pattern1(int i,int j,int n)
    {
        if(i>=n)
        {
            return;
        }

        if(j<n)
        {
            System.out.print("*");
            pattern1(i,j+1,n);
        }
        else
        {
            System.out.println();
            pattern1(i+1,0,n);
        }
    }
    public static void pattern5(int i,int j,int n)
    {
        if(i>=n)
        {
            return;
        }

        if(j<n-i)
        {
            System.out.print("*");
            pattern5(i,j+1,n);


        }
        else
        {
            System.out.println();
            pattern5(i+1,0,n);


        }
    }

    public static void pattern6(int i,int j,int n)
    {
        if(i>=n)
        {
            return;
        }

        if(j<n-i)
        {

            pattern6(i,j+1,n);
            System.out.print("*");

        }
        else
        {

            pattern6(i+1,0,n);
            System.out.println();

        }
    }

    public static void pattern(int r,int c)
    {
        if(r==0)
        {
            return;
        }

        if(r>c)
        {
            System.out.print("*");
            pattern(r,c+1);
        }
        else
        {
            System.out.println();
            pattern(r-1,0);
        }
    }
}
