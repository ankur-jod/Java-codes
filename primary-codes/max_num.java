//max among n numbers
import java.util.Scanner;
public class max_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int n = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The maximum number is " + max);
    }
}