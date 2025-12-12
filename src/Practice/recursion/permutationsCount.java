package Practice.recursion;

public class permutationsCount
{
    public static void main(String[] args) {
        System.out.println(permu("","abc"));
    }
    public static int permu(String p,String up)
    {

        if(up.isEmpty())
        {
            return 1;
        }
        int count=0;

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0,i);
            String last=p.substring(i,p.length());

            count=count+permu(first+ch+last,up.substring(1));
        }
        return count;

    }
}
