/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.factorial;
import java.util.*;
/**
 *
 * @author Administrator_Admin
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter a Number : ");
      int n=s.nextInt(),fact=1;
      for(int i=1;i<=n;i++)
      {
          fact*=i;
      }
      System.out.println(fact);
    }
    
}
