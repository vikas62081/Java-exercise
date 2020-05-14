/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.armstrong;

import java.util.Scanner;

/**
 *
 * @author Administrator_Admin
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a Number : ");
      int n=s.nextInt();
      for(int i=1;i<=n;i++){
      int temp=i,sum=0;
      while(temp!=0)
      {
       int rem=temp%10;
       sum=sum+(rem*rem*rem);
       temp/=10;
      }
      if(i==sum)
      {
          System.out.println(i+" ");
      }
      }
    }
    
}
