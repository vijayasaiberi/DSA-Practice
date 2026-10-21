import java.util.Scanner;
public class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) {
            System.out.println("Not an Alphabet");
        } else if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
