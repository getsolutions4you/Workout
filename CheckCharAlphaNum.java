import java.util.*;
public class CheckCharAlphaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a char:");
        char ch = sc.next().charAt(0);   
        sc.close();
        if(ch >= 'a' && ch <= 'z' || ch > 'A' && ch < 'B'){
            System.out.println("Character");
        }else if( ch >= '0' && ch <= '9'){
            System.out.println("Number");
        }else{
            System.out.println("Special Character");
        }
    }
}
