import java.util.Scanner;
public class swapTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int num2 = scanner.nextInt();
        scanner.close();
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1); 
        System.out.println(num2); 
    }
}
