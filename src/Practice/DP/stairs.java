package Practice.DP;

public class stairs
{
    public static void main(String[] args) {

        System.out.println(climb(4));
    }

    public static int climb(int n)
    {
        if(n<=2)
        {
            return n;
        }

        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
