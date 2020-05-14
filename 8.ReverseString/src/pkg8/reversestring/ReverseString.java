/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.reversestring;
import java.util.*;
/**
 *
 * @author Administrator_Admin
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a string : ");
      String str=s.nextLine();
      StringBuilder ss=new StringBuilder();
      ss.append(str);
      ss=ss.reverse();
      System.out.println("Reverse string is : "+ss);
    }
    
}
