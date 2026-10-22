import java.io.*;
import java.util.*;
public class OptimalPrimeGame{
static final int max=10000;
static boolean[] prime=new boolean[max+1];
static boolean[] dp=new boolean[max+1];
static void seive()
{
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    for(int i=2;i*i<=max;i++)
    {
        if(prime[i])
        {
            for(int j=i*i;j<=max;j+=i)
            {
                prime[j]=false;
            }
        }
    }
}
static void process()
{
    dp[0]=false;
    dp[1]=false;
    for(int i=2;i<=max;i++)
    {
        dp[i]=false;
        for(int p=2;p<=i;p++)
        {
            if(prime[p] && !dp[i-p])
            {
                dp[i]=true;
                break;
            }
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        seive();
        process();
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(!dp[n])
            {
                System.out.println("Second");
            }
            else
            {
                System.out.println("First");
            }
        }
         }
}