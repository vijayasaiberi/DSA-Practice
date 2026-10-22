import java.io.*;
import java.util.*;
public class MixedPrimeGame{
static final int max=10001;
static boolean[] prime=new boolean[max];
static boolean[] win=new boolean[max];
static int[] largestprime=new int[max];
public static void seive()
{
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    for(int i=2;i*i<=max;i++)
    {
        if(prime[i])
        {
            for(int j=i*i;j<max;j+=i)
            {
                prime[j]=false;
            }
        }
    }
    int last=0;
    for(int i=2;i<max;i++)
    {
        if(prime[i])
        {
            last=i;
        }
        largestprime[i]=last;
    }
}
public static void precompute()
{
    win[0]=false;
    win[1]=false;
    for(int i=2;i<max;i++)
    {
        int greedymove=largestprime[i];
        int next=i-greedymove;
        win[i]=false;
        for(int j=2;j<=next;j++)
        {
            if(prime[j])
            {
                int rem=next-j;
                if(win[rem]==false)
                {
                    win[i]=true;
                    break;
                }
            }
        }
        win[i]=!win[i];
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        seive();
precompute();
        int T=sc.nextInt();


while(T-->0)
{
int N=sc.nextInt();
if(win[N])
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