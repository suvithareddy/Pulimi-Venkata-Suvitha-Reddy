import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter an operation to perform (add / subtract / multiply / divide): ");
        String op = sc.next();

        double result = 0;
        if (op.equals("add"))
            result = a + b;
        else if (op.equals("subtract"))
            result = a - b;
        else if (op.equals("multiply"))
            result = a * b;
        else if (op.equals("divide")) {
            if (b != 0)
                result = a / b;
            else {
                System.out.println("Cannot divide by zero.");
                return;
            }
        } else {
            System.out.println("Invalid operation.");
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
