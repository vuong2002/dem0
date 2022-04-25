package baithuchanhngay2504.Person;

public class OnlineStudent {
    @override 
    private double gpa;
    public OnlineStudent(){

    }
    public OnlineStudent(double A, double B, double C, int id){
    super(double A, double B, double C, int id);
    gpa = A * 0.5 + B * 0.5 + C * 0.1;
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
        gpa = A * 0.5 + B * 0.5 + C * 0.1;
    }
}