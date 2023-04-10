import java.util.*;
class helloWorld{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scanner = new Scanner(System.in);

       
            String str = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d\n", str, num);
        

        scanner.close();
        
    }

}