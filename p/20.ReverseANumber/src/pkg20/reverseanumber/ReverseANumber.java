
package pkg20.reverseanumber;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=s.nextInt();
        int sum=0,rem;
        while(n!=0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println("Reverse Number is : "+sum);
    }
    
}
