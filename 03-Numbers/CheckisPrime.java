import java.io.*;
import java.util.*;
public class CheckisPrime{
public static boolean isPrime(int N)
{
    if(N==0 || N==1)
    {
        return false;
    }
    for(int i=2;i<=Math.sqrt(N);i++)
    {
        if(N%i==0)
        {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T-->0)
{
int N=sc.nextInt();
boolean res=isPrime(N);
if(res)
{
    System.out.println("Yes");
}
else
{
    System.out.println("No");
}
}
}
}