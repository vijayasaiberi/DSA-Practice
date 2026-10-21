import java.io.*;
import java.util.*;
public class InvertedPyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int col=n-i+1;
            for(int j=1;j<=col;j++)
            {
                if(i==1 || j==1 || j==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                if(j<col)
                {
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
         }
}