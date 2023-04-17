import java.util.Scanner;
public class UserInputShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String UserName = sc.nextLine();
        System.out.println("Your Name is : "+UserName);
        sc.close();
    }
}
