import java.util.Scanner;
public class UserPostalCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Postal Code");
        int PostCode = sc.nextInt();
        System.out.println("Your Postal Code is : "+PostCode);
        sc.close();
    }
}
