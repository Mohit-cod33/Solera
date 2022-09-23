package daytwo.interfaceE;

public class Implinterf implements ExamplInterf {

	@Override
	public void add(int n, int m) {
		
		System.out.println(n+m);

	}
	public void show() {
		System.out.println("this is class method");
	}

}
