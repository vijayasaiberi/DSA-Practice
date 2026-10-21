import java.io.*;
import java.util.*;
public class PascalsTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            long cur=1;
            StringBuilder row=new StringBuilder();
            for(int j=0;j<=i;j++)
            {
                row.append(cur);
                if(j<i)
                {
                    row.append(" ");
                }
                cur=cur*(i-j)/(j+1);
            }
            System.out.println(row.toString());
        }
    }
}