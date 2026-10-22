import java.util.*;
public class ArrangePrimes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int primeCount=0;
        long mod=1000000007;
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        if(n>=0) prime[0]=false;
        if(n>=1) prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]){
                primeCount++;
            }
        }
        long ans=1;
        for(int i=1;i<=primeCount;i++){
            ans=(ans*i)%mod;
        }
        for(int i=1;i<=n-primeCount;i++){
            ans=(ans*i)%mod;
        }
        System.out.println(ans);
    }
}
