import java.util.Arrays;
public class Anagram
{
    public static Boolean isAnagram(String a, String b) {
        int i;

        i = 0;

        char tmpa[] = a.toLowerCase().toCharArray();
        char tmpb[] = b.toLowerCase().toCharArray();

        Arrays.sort(tmpa);
        Arrays.sort(tmpb);
        if (a.length() != b.length())
            return false;
        else
        {
            while (i < tmpa.length && i < tmpb.length)
            {
                if (tmpa[i] == tmpb[i])
                    i++;
                else
                    return false;
            }
        }
        return true;
    }
}