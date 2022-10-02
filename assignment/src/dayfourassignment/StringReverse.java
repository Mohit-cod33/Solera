package dayfourassignment;

import java.util.Scanner;

public class StringReverse {
	public static String reves(String s,String m,int n) {
		if(n==-1)
			return m;
		else {
			m=m+s.charAt(n);
			return reves(s,m,n-1);
		
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.print("Iterative method......:- ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.print("Recursive method...... ");
		String s="";
		System.out.println(":- "+reves(str,s,str.length()-1));
		
	}

}
