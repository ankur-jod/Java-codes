//prime numbers
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if((num==1)||(num==0)||(num<0))
            System.out.println(num + " is not a prime number");
        else{
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}

