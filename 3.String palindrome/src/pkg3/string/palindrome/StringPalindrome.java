
package pkg3.string.palindrome;
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a String : ");
       String s1=s.nextLine();
       String s2=s1.toUpperCase();
       StringBuilder ss=new StringBuilder();
       ss.append(s2);
       ss=ss.reverse();
       if(s2.compareTo(ss.toString())==0)
       {
           System.out.println("Palindrome");
       }
       else
       {
           System.out.println("Not palindrome");
       }
    }
    
}
