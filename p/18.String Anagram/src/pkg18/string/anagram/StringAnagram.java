
package pkg18.string.anagram;
import java.util.*;
public class StringAnagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1=s.nextLine();
        System.out.println("Enter second String : ");
        String str2=s.nextLine();
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2))
        {
            System.out.println("Yes, String are Anagram");
        }
        else
        {
            System.out.println("No, String are not Anagram");
        }
    }
    
}
