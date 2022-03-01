import java.util.Scanner;

public class App6 {
    public static boolean sohoanthien(int a){
        int sum = 0;
        for ( int i = 1; i < a; i++){
            if (a % i == 0){
                sum += i;
            }
        }
        if ( a == sum){ 
            return true;
        }
        else return false;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap vao n: ");
        int n = scan.nextInt();
        System.out.println("cac so hoan thien nho hon n la:");
        for ( int i = 1; i < n; i++){
            if (sohoanthien(i) == true){
                System.out.print(+ i + " ");
            }
        }

    }
}