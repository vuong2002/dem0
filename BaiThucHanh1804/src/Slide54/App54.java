package Slide54;

import Slide54.shapes.HinhTron;
import Slide54.shapes.hinhChuNhat;
import Slide54.shapes.hinhVuong;
import Slide54.shapes.hinhTru;

public class App54 {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        // kiem tra hình trụ
        hinhTru hTru = new hinhTru();
        hTru.xuatTen();
        hTru.nhapChieuCao();
        hTru.tinhTheTich();
        hTru.inTheTich();

        // kiem tra hinh chữ nhật
        hinhChuNhat hCN = new hinhChuNhat();
        hCN.xuatTen();
        hCN.nhapChieuDai();
        hCN.nhapChieuRong();
        hCN.tinhChuVi();
        hCN.tinhDienTich();
        hCN.inChuVi();
        hCN.inDienTich();

        // kiem tra hình vuông
        hinhVuong hV = new hinhVuong();
        hV.xuatTen();
        hV.nhapChieuDai();
        hV.tinhChuVi();
        hV.tinhDienTich();
        hV.inChuVi();
        hV.inDienTich();
    }
}