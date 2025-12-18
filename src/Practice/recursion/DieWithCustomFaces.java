package Practice.recursion;

public class DieWithCustomFaces
{
    public static void main(String[] args) {
        dice("",4,7);
    }
    public static void dice(String p,int target,int faces)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=faces && i<=target;i++)
        {
            dice(p+i,target-i,faces);
        }
    }
}
