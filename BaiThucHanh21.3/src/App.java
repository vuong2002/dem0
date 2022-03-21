import java.util.Scanner;
import static java.lang.System.out;
public class app{
    public static void main (String[] agrs){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
    }
}
class HinhChuNhat{
    float chieuDai, chieuRong,chuVi,dienTich;
    void nhapchieudai(){
        out.println("nhập chiều dài hình chữ nhật: ");
        Scanner p = new Scanner(System.in);
        chieuDai = p.nextFloat();
    }
    void nhapchieurong(){
        out.println("nhập chiều rộng hình chữ nhật: ");
        Scanner r = new Scanner(System.in);
        chieuRong = r.nextFloat();
    }
    void tinhchuvi(){
        chuVi = 2 * (chieuDai + chieuRong);
    }
    void tinhdientich(){
        dienTich = chieuDai * chieuRong ;
    }
    void inchuvi(){
        out.println("chu vi hình chữ nhật: " + chuVi);
    }
    void indientich(){
        out.println("diện tích hình chữ nhật: " + dienTich);
    }
}
