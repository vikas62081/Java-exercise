/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.integer.palindrome;

import java.util.Scanner;

/**
 *
 * @author Administrator_Admin
 */
public class IntegerPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
       System.out.println("Enter a Number : ");
      int n=s.nextInt();
      int temp=n,sum=0;
      while(n!=0)
      {
       int rem=n%10;
       sum=sum*10+rem;
       n/=10;
      }
      if(temp==sum)
      {
          System.out.println("Integer Palindrome");
      }else
      {
          System.out.println("Not Integer Palindrome");
      }
    }
    
}
