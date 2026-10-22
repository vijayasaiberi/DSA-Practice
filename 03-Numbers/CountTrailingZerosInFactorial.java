import java.util.*;
public class CountTrailingZerosInFactorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
        }
        System.out.println(count);
    }
}
