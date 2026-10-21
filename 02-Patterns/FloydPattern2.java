import java.io.*;
import java.util.*;
public class FloydPattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int cur=i;
            int steps=n-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(cur);
                if(j<i)
                {
                    System.out.print(" ");
                }
                cur=cur+steps;
                steps--;
            }
            System.out.println();
        }
        }
}