
package pkg1.fibonacci_series;
import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("How many term do you want : ");
       int n=s.nextInt();
       int a=0,b=1,c;
       for(int i=0;i<n;i++)
       {
          c=a+b;
          System.out.print(" "+a);
          a=b;
          b=c;
       }
    }
    
}
