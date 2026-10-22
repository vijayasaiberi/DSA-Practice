import java.io.*;
import java.util.*;
public class HarshadNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=0;
        while(n!=0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        n=temp;
        if(n%sum==0)
        {
        System.out.println("Yes");
       
         }
         else
         {
             System.out.println("No");
         }
     }
}