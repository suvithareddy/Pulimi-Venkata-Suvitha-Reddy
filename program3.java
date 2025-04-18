import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= count; i += 2) {
            System.out.print(i);
            if (i + 2 <= count) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
