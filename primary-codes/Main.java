import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner1.nextInt();
        int sum = 0;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter range:");
        int r = scanner2.nextInt();

        for (int i = 1; i <= r; i++) {
            int number = n * i;
            sum =sum + number;
        }
        System.out.println("Sum of the series is: " + sum);
    }
}
