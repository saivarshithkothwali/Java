package Practice.Strings;

import java.util.Arrays;

public class ReverseWordsBrute1
{
    public static void main(String[] args)
    {
        System.out.println(reverse("   Hello  Coder "));

    }
    public static String reverse(String str) {
        String[] strArray = str.trim().split("\\s+ ");

        StringBuilder sb = new StringBuilder();

        for (int i = strArray.length - 1; i >= 0; i--)
        {

            if (sb.isEmpty())
            {
                sb.append(strArray[i]);
            }
            else
            {
                sb.append(" ");
                sb.append(strArray[i]);
            }

        }
        return sb.toString();
    }
}
