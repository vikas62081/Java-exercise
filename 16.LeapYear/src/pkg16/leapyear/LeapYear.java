/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.leapyear;
import java.util.*;
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int Year=s.nextInt();
        if(Year%4==0)
        {
            System.out.println("Leap year");
        }
        else 
        {
            System.out.println("Not Leap Year");
        }
    }
    
}
