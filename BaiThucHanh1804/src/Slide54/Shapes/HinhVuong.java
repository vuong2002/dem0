package Slide54.shapes;

import java.util.Scanner;

import Slide54.shapes.hinhChuNhat;

public class hinhVuong extends hinhChuNhat {
    public float chieuCao;

    public hinhVuong() {
        ten = "Hình Vuông";
    }

    public void nhapCanh() {
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }

}