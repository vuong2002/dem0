import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("C#");
        arrListString.add("Java");
        arrListString.add(1, "PHP");
        System.out.println("Cac phan tu co trong danh sach la:");
        for (String str : arrListString){
            System.out.println(str);
        }
    }
}