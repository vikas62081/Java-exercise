
package pkg14.reversearray;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        ArrayList alist=new ArrayList();
        for(int i=n-1;i>=0;i--)
        {
            alist.add(a[i]);
        }
       System.out.println("reverse array\n"+alist);
    }
    
}
