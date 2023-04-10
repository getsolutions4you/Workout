import java.util.*;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter actual price");
        int actPrice = sc.nextInt();
        System.out.println("Enter sell price");
        int sell = sc.nextInt();
        sc.close();

        if(actPrice > sell) {
            System.out.println("Loss");
        }else{
            System.out.println("Profit");
        }
    }
}
