package Practice.Strings;

public class ValidAnagramOptimal
{
    public static void main(String[] args)
    {
        String str1="anagram";
        String str2="nagaram";

        System.out.println(valid(str1,str2));

    }
    public static boolean valid(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }

        int[] freq=new int[26];


        for(int i=0;i<str1.length();i++)
        {
            int index1=str1.charAt(i)-97;

            freq[index1]=freq[index1]+1;

            int index2=str2.charAt(i)-97;
            freq[index2]=freq[index2]-1;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
