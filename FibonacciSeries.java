import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = sc.nextInt();

        int fisrtNo = 0;
        int secNo = 1;
        System.out.print(fisrtNo);
        System.out.print(","+secNo); 
        int third = 0;
        for(int i = 2; i < num; i++){
            third = fisrtNo + secNo;
            System.out.print(","+third); 
            fisrtNo = secNo;
            secNo = third;

        }
        System.out.println();
        System.out.println("Sum of "+num+" fibonacci Series is : "+third);
        sc.close();
    }
}
