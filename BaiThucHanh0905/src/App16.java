import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("C#");
        arrListString.add("Java");
        arrListString.add(1, "PHP");
        System.out.println("Cac phan tu co trong danh sach la:");
        for(int i = 0; i < arrListString.size(); i++){
            System.out.println(arrListString.get(i));
        }

        arrListString.set(1 , "JavaScript");
        System.out.println("Cac phan tu co trong danh sach sau khi sua la:");
        for(int i = 0; i < arrListString.size(); i++){
            System.out.println(arrListString.get(i));
        }

        arrListString.remove(1);
        arrListString.remove("PHP");
        System.out.println("Cac phan tu co trong danh sach sau khi xoa la:");
        for(int i = 0; i < arrListString.size(); i++){
            System.out.println(arrListString.get(i));
        }
    }
}