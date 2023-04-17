import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        int sum = 0;
        sum = num*(num+1)/2;
        System.out.println("Sum of natural "+num+" number is : "+sum);
        sc.close();
    }
}
