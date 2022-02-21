package cau_truc_ifelse;
import java.util.Scanner;
public class TimSoNhoNhat {
    public static void main (String[] args) {
        int firstNumber; SecondNumber;
        Scanner Scanner = new Scanner (System.in);
        System.out.println("nhap vao so thu nhat: ");
        firstNumber = Scanner.nextInt();
        System.out.println("nhap vao so thu hai: ");
        SecondNumber = Scanner.nextInt();
        int minNumber = firstNumber;
    if (firstNumber > SecondNumber)
        minNumber = SecondNumber;
        System.out.println("so nho nhat trong hai so la: " minNumber);

    }
}