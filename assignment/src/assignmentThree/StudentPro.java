package assignmentThree;

public class StudentPro{
	private int id;

	private String fname;

	private double cgpa;

	public StudentPro(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
		}
	
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

}
