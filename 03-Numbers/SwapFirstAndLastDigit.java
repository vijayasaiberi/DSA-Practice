import java.util.Scanner;
public class SwapFirstAndLastDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int last=n%10;
        int first=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int divisor=1;
        for(int i=1;i<count;i++){
            divisor=divisor*10;
        }
        first=n/divisor;
        int middle=n%divisor;
        middle=middle/10;
        int result=last*divisor+middle*10+first;
        System.out.println(result);
    }
}
