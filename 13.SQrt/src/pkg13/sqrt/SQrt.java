/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.sqrt;
import java.util.*;
/**
 *
 * @author Administrator_Admin
 */
public class SQrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a number : ");
       int n=s.nextInt();
       int i;
       for(i=1;i<n;i++)
       {
           if(i*i==n)
           {
               break;
           }
       }
       if(i==n)
       {
           System.out.println("No perfect Square root of "+n);
       }
       else 
           System.out.println("Perfect Square root of "+n+" is "+i);
    }
    
}
