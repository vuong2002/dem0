import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float max = 0;
        float n =1;
        while( n != 0){
            System.out.println("nhap vao so thuc n: ");
            n = scan.nextFloat();
            if ( n > max){
                max = n;
            }
        }
        System.out.println("so lon nhat la: " + max );

    }
}
