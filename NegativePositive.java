import java.util.*;
public class NegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ennter a number:");
        int num = sc.nextInt();
        sc.close();
        if( num == 0){
            System.out.println("Number is Zero:");
        }else if( num > 0 ){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }
}
