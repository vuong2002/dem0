package baithuchanhngay2504.Person;

public class Student extends Person {
    private double A, B, C;
    private int id;

	public Student(String name, int age,String address,double A, double B, double C, int id) {
		super(name, age);
        this.id = id;
	}
	public double getA() {
		return A;
	}

	public void setA(double A) {
		this.A = A;
	}
    public double getB() {
		return B;
	}

	public void setB(double B) {
		this.B = B;
	}
    public double getC() {
		return C;
	}

	public void setA(double C) {
		this.C = C;
	}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void display() {
        super.display();
        System.out.println("\tDiem A: " + A);
        System.out.println("\tDiem B: " + B);
        System.out.println("\tDiem C: " + C);
    }

    public void enter(Scanner sc) {
        super.enter(sc);
        System.out.print("\tNhap diem A: ");
        A = sc.nextDouble();
        System.out.print("\tNhap diem B: ");
        B = sc.nextDouble();
        System.out.print("\tNhap diem C: ");
        C = sc.nextDouble();
    }
}