package daythree.string;

public class strip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = '\u2003' + "Java";
	      System.out.println("String: " + string1);
	      System.out.println("String length: " + string1.length());

	      String string2 = string1.trim();
	      System.out.println("After using trim() function: " + string2);
	      System.out.println("Length: " + string2.length());

	      String string3 = string1.strip();
	      System.out.println("After using strip() function: " + string3);
	      System.out.println("Length: " + string3.length());
	      
	      System.out.println();

	      System.out.println();
	      String string11 = "   Java   " + "\u2003\u2003\u2003";
	      System.out.println("String: " + string11);
	      System.out.println("String length: " + string11.length());

	      String string22 = string1.trim();
	      System.out.println("After using trim() function: " + string22);
	      System.out.println("Length: " + string22.length());

	      String string4 = string1.strip();
	      System.out.println("After using strip() function: " + string4);
	      System.out.println("Length: " + string4.length());
	}

}
