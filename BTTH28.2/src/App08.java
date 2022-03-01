import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n = 1;
        float max = 0;
        while( n != 0){
            System.out.print("nhap vao n: ");
            n = scan.nextFloat();
            if ( n % 5 == 0){
                if (n > max){
                    max = n;
                }
            }
        }
        System.out.print("So lon nhat chia het cho 5 la: " + max);
    }
}