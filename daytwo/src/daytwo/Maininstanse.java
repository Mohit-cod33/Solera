package daytwo;

public class Maininstanse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator op=new Operator();
		if(op instanceof instanceOperator) {
			System.out.println("op is instance of that class");
		}
		else
			System.out.println("it is not");

	}

}
