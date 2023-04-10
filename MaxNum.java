import java.util.*;
public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ennter first number:");
        int num1 = sc.nextInt();
        System.out.println("Please ennter second number:");
        int num2 = sc.nextInt();
        sc.close();
        int result = (num1 > num2) ? num1 : num2;
        System.out.println("Max number is: "+result);

    }
}
