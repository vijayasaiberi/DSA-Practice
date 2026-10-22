import java.io.*;
import java.util.*;
public class LargeRangePrimes{
 public static ArrayList<Integer> seive(int n)
{
    boolean[] prime=new boolean[n+1];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    for(int i=2;i*i<=n;i++)
    {
        if(prime[i])
        {
            for(int j=i*i;j<=n;j+=i)
            {
                prime[j]=false;
            }
        }
    }
     ArrayList<Integer> list=new ArrayList<>();
    
        for(int i=2;i<=n;i++)
        {
            if(prime[i])
            {
               list.add(i);
            }
        }
    return list;
}
static void solve(long a,long b)
{
    int size=(int)Math.sqrt(b);
    ArrayList<Integer> primes=seive(size);
    boolean ans[]=new boolean[(int)(b-a+1)];
    Arrays.fill(ans,true);
    for(int p:primes)
    {
        long start=smallmultiples(a,p);
        if(start==p)start+=p;
        for(long j=start;j<=b;j+=p)
        {
            ans[(int)(j-a)]=false;
        }
    }
    if(a==0)
    {
        ans[0]=false;
        if(b>=1)
        {
            ans[1]=false;
        }
    }
    if(a==1)
    {
        ans[0]=false;
    }
    for(long i=a;i<=b;i++)
    {
        if(ans[(int)(i-a)])
        {
            System.out.println(i+" ");
        }
    }
}
static long smallmultiples(long a,int p)
{
    if(a%p==0)
    {
        return a;
    }
    return ((a/p)+1)*p;
}
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long m=sc.nextLong();
            long n=sc.nextLong();
           solve(m,n);
        
         System.out.println();
        }
    }
}