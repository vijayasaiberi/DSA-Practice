import java.util.Scanner;
public class LCM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        int gcd=a;
        int lcm=(x/gcd)*y;
        System.out.println(Math.abs(lcm));
    }
}
