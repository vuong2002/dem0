package baithuchanhngay2504.Person;

public class FulltimeEmployee extends Employee {
    private double ngayNghi;
    private double ngayLamThem;
    public PartimeEmployee(double salary, double ngayNghi, double ngayLamThem)
    super(salary);
    this.ngayNghi = ngayNghi;
    this.ngayLamThem = ngayLamThem;
    public double totalSalary() {
        return salary * (30 - ngayNghi) + salary * 1.5 * ngayLamThem;
    }
    public void display() {
        super.display();
        System.out.println("\tTong luong: " + totalSalary());
    }
}