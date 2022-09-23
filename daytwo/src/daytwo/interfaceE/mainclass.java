package daytwo.interfaceE;

public class mainclass {
	
	public static void main(String []args) {
		ExamplInterf inter= new Implinterf();
		Implinterf classobj=new Implinterf();
		inter.add(8, 9);
		inter.calMul(4, 5);
		ExamplInterf.display();
		classobj.add(4, 5);
		classobj.calMul(2, 20);
		classobj.show();
		
	}
}
