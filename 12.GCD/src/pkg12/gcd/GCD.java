/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.gcd;
import java.util.*;
/**
 *
 * @author Administrator_Admin
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number : ");
        int a=s.nextInt();
        int b=s.nextInt();
        int i;
        for(i=a*b;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                break;
            }
        }
        System.out.println("GCD if given two number : "+i);
    }
    
}
