
package xx;
import java.util.*;
public class Xx {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int n=s.nextInt();
        int a=0,b=1,c,j=2;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                c=a+b;
                a=b;
                b=c;
                System.out.print(a+" ");
            }
            else
            {
                int f=1;
                
                while(f==1)
                {int flag=0;
                    for(int k=2;k<j;k++)
                    {
                        if(j%k==0)
                            flag=1;
                    }
                    if(flag==0)
                    {
                        System.out.print(j+" ");
                         f=0;
                    }
                    j++;
                   
                }
                
            }
        }
        
    }
   
}
