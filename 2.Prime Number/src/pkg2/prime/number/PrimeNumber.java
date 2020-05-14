
package pkg2.prime.number;
import java.util.*;
/**
 *
 * @author Administrator_Admin
 */
public class PrimeNumber {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter maximum value : ");
       int n=s.nextInt();
       int flag=0,count=0;
       for(int i=2;i<=n;i++)
       {flag=0;
           for(int j=2;j<i;j++)
           {
               if(i%j==0)
               {
                   flag=1;
               }
           }
           if(flag==0)
           {
               System.out.print(" "+i);
               count++;
           }
       }
       System.out.println("\n Total prime number are "+count);
    }
    
}
