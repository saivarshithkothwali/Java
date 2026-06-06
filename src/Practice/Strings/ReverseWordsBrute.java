package Practice.Strings;

public class ReverseWordsBrute
{
    public static void main(String[] args) {
        System.out.println(reverse("   Hello  Coder "));

    }
    public static String reverse(String str)
    {
        String[] strArray=str.split(" ");
        String output="";

        for(int i= strArray.length-1;i>=0;i--)
        {
            if(strArray[i].length()!=0)
            {
                if(output.isEmpty())
                {
                    output=output+strArray[i];
                }
                else
                {
                    output=output+" "+strArray[i];
                }

            }
        }
        return output;


    }
}
