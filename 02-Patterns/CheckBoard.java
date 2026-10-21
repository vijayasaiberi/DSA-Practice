import java.io.*;
import java.util.*;
public class CheckBoard{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++)
        {
             int n=sc.nextInt();
            System.out.println("Case #"+t+":");
            for(int i=0;i<2*n;i++)
            {
                for(int j=0;j<2*n;j++)
                {
                    if(((i /2) + (j/2)) % 2==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                }
            System.out.println();
            }
        }
    }
}