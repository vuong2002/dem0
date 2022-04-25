package baithuchanhngay2504.Person;

public class PartimeEmployee extends Employee {
    private double time;
    public PartimeEmployee(double salary, double time)
    super(salary);
    this.time = time;
    public double totalSalary() {
        return salary * time;
    }
    public void display() {
        super.display();
        System.out.println("\tTong luong: " + totalSalary());
    }
}