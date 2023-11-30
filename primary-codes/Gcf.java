//gcf of two numbers
import java.util.Scanner;
public class Gcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        System.out.println("GCF of " + a + " and " + b + " is " + gcf);
    }
}