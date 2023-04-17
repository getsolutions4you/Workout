public class TenTable {
    public static void main(String[] args) {
        for ( int i = 2; i < 11; i++){
            System.out.println("Table of : "+i);

            int y = 1;
            do{
                System.out.println(i*y);
                y++;
            }while(y <= 10);
        }
    }
}
