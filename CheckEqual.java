import java.util.Scanner;
public class CheckEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        if( num1 == num2) {
            System.out.println("Fisrt number is equal to second number");
        }else{
            System.out.println("Enter number is not equal");
        }
        sc.close();
    }
}
