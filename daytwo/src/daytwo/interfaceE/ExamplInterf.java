package daytwo.interfaceE;

public interface ExamplInterf {
	public void add(int n, int m);
	static void display() {
		System.out.println("this is static method of interface");
	}
	default void calMul(int n, int m) {
		System.out.println(n*m);
	}

}
