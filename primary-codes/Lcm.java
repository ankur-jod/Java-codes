
import java.util.Scanner;
public class Lcm{
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int n2 = scanner2.nextInt();
        int lcm;
        if(n1>n2){
            lcm = n1;
        }else{
            lcm = n2;
        }
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("Lcm of "+n1+" and "+n2+" is "+lcm);
                break;
            }
            lcm++;
        }
    }
}