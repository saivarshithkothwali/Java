package Practice.recursion;

public class reverseString
{
    public static void main(String[] args)
    {
        reverse("sai",0,"");

    }
    public static void reverse(String input,int index,String rev)
    {
        if(index==input.length())
        {
            System.out.println(rev);
            return;
        }
        rev=input.charAt(index)+rev;
        reverse(input,index+1,rev);
    }
}
