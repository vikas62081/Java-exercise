
package pkg1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("How many elements do you want to enter: ");
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
     List<Integer> alist=new IntegerListWrap(a);
    
          System.out.println(alist);
        
        
    }
    
}
