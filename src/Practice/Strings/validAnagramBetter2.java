package Practice.Strings;

public class validAnagramBetter2
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

        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(int i=0;i<str1.length();i++)
        {
            int index1=str1.charAt(i)-97;

            freq1[index1]=freq1[index1]+1;

            int index2=str2.charAt(i)-97;
            freq2[index2]=freq2[index2]+1;
        }

        for(int i=0;i<freq1.length;i++)
        {
            if(freq1[i]==freq2[i])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

}
