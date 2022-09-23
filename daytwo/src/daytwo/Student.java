package daytwo;

public class Student {
	private  String studentName;
	private static int age;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Student.age = age;
	}
	

}
