import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (number % 6 == 0 && number % 10 == 0) {
            System.out.println(number + " is a multiple of 6 and 10");
        } else {
            System.out.println(number + " is not a multiple of 6 and 10");
        }
    }
}