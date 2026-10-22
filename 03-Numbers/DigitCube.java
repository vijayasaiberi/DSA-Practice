import java.io.*;
import java.util.*;
public class DigitCube{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
         int rev=0,dig;
          double sum=0;
        while(temp!=0)
        {
            dig=temp%10;
            sum+=dig*dig*dig;
            temp=temp/10; 
        }
        if(sum==n)
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }  
        }
}