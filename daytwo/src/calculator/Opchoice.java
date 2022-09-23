package calculator;

public class Opchoice extends Operations {
	Operations obj=new Operations();
		int n;
		int a,b;
		public Opchoice(int n, int a, int b) {
			super();
			this.n = n;
			this.a = a;
			this.b = b;
		}
		switch(n) {
		case 1:
			obj.add(a,b);
			break;
		case 2:
			obj.sub(a,b);
			break;
		case 3:
			obj.mul(a,b);
			break;
		case 4:
			obj.div(a,b);
			break;
		default:
			System.out.println("invalid choice");
			break;
		
	}
}
