import java.util.*;
public class MaxOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Please enter third number:");
        int num3 = sc.nextInt();
        sc.close();

        if(num1 > num2 && num1 > num3){
            System.out.println("Greatest number: "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Greatest number: "+num2);
        }else{
            System.out.println("Greatest number: "+num3);
        }
    }
}