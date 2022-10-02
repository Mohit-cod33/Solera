package dayfourassignment;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		int i=0,j=s.length();
		//String regex="^[a-zA-Z]+";//  ^[a-zA-Z][0-9]+
		if(s.matches("[0-9]+"))
			System.out.println("It contains  digit only.");
		else if(s.matches("[a-z]+"))
			System.out.println("It contains  String only");
		else
			System.out.println("It contains String as well as digit");
	}
}
