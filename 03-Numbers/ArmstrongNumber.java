import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int count = 0;
        int sum = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (n >= 0 && sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
