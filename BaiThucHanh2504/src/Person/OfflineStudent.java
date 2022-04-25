package baithuchanhngay2504.Person;

public class OfflineStudent extends Student {
    private double gpa;
    public OfflineStudent(){

    }
    public OfflineStudent(double A, double B, double C, int id){
    super(double A, double B, double C, int id);
    gpa = A * 0.6 + B * 0.4 + C * 0.1;
    }
    public double getGpa() {
        return gpa;
    }
    public void display() {
        super.display();
        System.out.println("\tDiem trung binh: " + gpa);
    }
    public void enter(Scanner sc) {
        super.enter(sc);
        gpa = A * 0.6 + B * 0.4 + C * 0.1;
    }

}