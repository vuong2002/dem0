package baithuchanhngay2504.Person;

public class VIPCustomer extends Person {
    private long SDT;
    public VIPCustomer (String name, int age, String address, long SDT) {
        super(name, age, address);
        this.sdt=sdt;
        public void display() {
            super.display();
            System.out.println("So dien thoai la: " + sdt);
}