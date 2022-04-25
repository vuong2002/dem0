package baithuchanhngay2504.Person;

public class Employee extends Person {
    private double salary;

    public Employee() {

    }

    public Employee(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public void display() {
        super.display();
    }
}