import java.io.*;
import java.util.*;
public class GreedyPrimeGame{
public static boolean isPrime(int n)
{
    if(n<2)
    {
        return false;
    }
    for(int i=2;i*i<=n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}
public static int LargeNum(int n)
{
    for(int i=n;i>=2;i--)
    {
        if(isPrime(i))
        {
            return i;
        }
    }
    return 0;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int turns=0;
            while(n>=2)
            {
                int p=LargeNum(n);
                n-=p;
                turns++;
            }
            if(turns%2==1)
            {
                System.out.println("First");
            }
            else
            {
                System.out.println("Second");
            }
        }
        }
}