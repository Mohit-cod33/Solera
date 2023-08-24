
public class ImplementTrigno implements Trigno {

	@Override
	public double sin(double x) {
		// TODO Auto-generated method stub
		return (Math.sin(Math.toRadians(x)));
	}

	@Override
	public double cosec(double x) {
		// TODO Auto-generated method stub
		return (1/Math.sin(Math.toRadians(x)));
	}

	@Override
	public double cos(double x) {
		// TODO Auto-generated method stub
		return Math.cos(Math.toRadians(x));
	}

	@Override
	public double sec(double x) {
		// TODO Auto-generated method stub
		return (1/Math.cos(Math.toRadians(x)));
	}

	@Override
	public double tan(double x) {
		// TODO Auto-generated method stub
		return Math.tan(Math.toRadians(x));
	}

	@Override
	public double cot(double x) {
		// TODO Auto-generated method stub
		return (1/Math.tan(Math.toRadians(x)));
	}
	

}
