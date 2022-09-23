package daythree.string;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c= {'h','e','l','l','o'};
		String str=new String(c);
		String s="hello";
		if("hello" instanceof String) {
			System.out.println(true);
		}
		s="hi";
		System.out.println(s);
	}

}
