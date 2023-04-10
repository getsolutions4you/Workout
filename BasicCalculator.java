import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter opration symbol for pluse(+) : minus(-) : multi(*) : division(/)");
        char opration = sc.next().charAt(0); 
        int result = 0;
        sc.close();
        if(opration == '+'){
            result = num1 + num2;
        }else if(opration == '-'){
            result = num1 - num2;
        }else if(opration == '*'){
            result = num1 * num2;
        }else if(opration == '/'){
            result = num1 / num2;
        }else{
            System.out.println("Invalid Opration");
        }

        System.out.println("Result = "+result);
    }
}
