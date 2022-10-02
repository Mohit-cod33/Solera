package enumclass;

enum Color{
	BLUE,
	GREEN,
	RED,
	BLACK,
	WHITE;
}
/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/

public class EnumDeclaration {
	//enum declaration can be done outside or inside the class only, not inside the method.
	enum Days{
		
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
		
		private Days() {
			System.out.println("constructor for :"+this.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c=Color.GREEN;
		System.out.println(Color.BLACK);
		System.out.println(c);
		System.out.println(Days.SUNDAY);

	}

}
