
import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            char[][] a = new char[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = ' ';
                }
            }

            int top = 0, bottom = n - 1;
            int left = 0, right = n - 1;

            while (top <= bottom && left <= right) {

                for (int j = left; j <= right; j++) {
                    a[top][j] = '*';
                }

                for (int i = top; i <= bottom; i++) {
                    a[i][right] = '*';
                }

                if (top + 2 <= bottom) {
                    for (int j = right - 2; j >= left; j--) {
                        a[bottom][j] = '*';
                    }
                }

                if (left + 2 <= right) {
                    for (int i = bottom - 2; i >= top + 2; i--) {
                        a[i][left] = '*';
                    }
                }

                top += 2;
                left += 2;
                bottom -= 2;
                right -= 2;
            }

            System.out.println("Case #" + tc + ":");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]);
                    if (j < n - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
