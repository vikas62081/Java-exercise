/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.duplicatearray;

import java.lang.*;
import java.util.*;
public class DuplicateArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter a Number : ");
      int n=s.nextInt();
      int[] a=new int[n];
      ArrayList alist=new ArrayList();
      for(int i=0;i<n;i++)
      {
          a[i]=s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
          alist.add(a[i]);
      }
     System.out.println(alist);
    LinkedHashSet h=new LinkedHashSet(alist);
     System.out.println(h);
     
    
    }
    
}
