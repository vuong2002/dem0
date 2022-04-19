package Slide54.shapes;

import java.util.Scanner;

public class hinhTru extends HinhTron {
    public float chieuCao;

    public hinhTru() {
        ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}