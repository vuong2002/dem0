import java.util.Scanner;
public class Person{
public static void main (String[] agrs){
    Scanner sc = new Scanner(System.in);
    person ps = new person();
    ps.nhapThongTin(sc);
    ps.hienThi();
}
}
 class person {
    String PersonID;
    String PersonName;
    boolean Gender;
    String Address;

public String getPersonID() {
    return PersonID;
}

public void setPersonID(String PersonName) {
    this.PersonID = PersonID;
}

public String getPersonName() {
    return PersonName;
}

public void setPersonName(String PersonName) {
    this.PersonName = PersonName;
}

public boolean getGender() {
    return Gender;
}

public void setGender(Boolean Gender) {
    this.Gender = Gender;
}

public String getAddress() {
    return Address;
}

public void setAddress(String Address) {
    this.Address = Address;
}
public void hienThi() {
    System.out.println("\tId: " + PersonID);
    System.out.println("\tHo ten: " + PersonName);
    System.out.println("\tGioi tinh: " + Gender);
    System.out.println("\tDia chi: " + Address);
}
public void nhapThongTin(Scanner sc) {
    System.out.print("\tNhap id: ");
    PersonID = sc.nextLine();
    System.out.print("\tNhap ho ten: ");
    sc.nextLine();
    PersonName = sc.nextLine();
    System.out.print("\tNhap gioi tinh: ");
    Gender = sc.nextBoolean();
    System.out.print("\tNhap dia chi: ");
    Address = sc.nextLine();
}
}