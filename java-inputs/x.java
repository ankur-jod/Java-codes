public class X {
    public static void main(String[] args) {
        int number = 2;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            sum += product;
        }

        System.out.println("Sum of the numbers in the multiplication table of 8: " + sum);
    }
}
