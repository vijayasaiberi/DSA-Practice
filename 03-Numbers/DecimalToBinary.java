import java.util.Scanner;
public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String binary="";
        if(n==0){
            binary="0";
        }
        while(n>0){
            int remainder=n%2;
            binary=remainder+binary;
            n=n/2;
        }
        System.out.println(binary);
    }
}
