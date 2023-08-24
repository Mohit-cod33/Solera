package currancy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Pattern p=Pattern.compile(".a");
		Matcher m=p.matcher("pa");
		boolean matches =m.matches();
		System.out.println(matches);
		boolean pat=Pattern.compile("..a").matcher("spa").matches();
		System.out.println(pat);
		System.out.println("*********************");
		Pattern patt = Pattern.compile("[\\w]");
		Matcher match = patt.matcher("*&%@#!}{");
		System.out.println(match.matches());
		
		Pattern pq = Pattern.compile("pq*?",Pattern.CASE_INSENSITIVE);
		Matcher mp = pq.matcher("p");
		System.out.println("*********************");
		System.out.println(mp.matches());
		
		Matcher mpq = pq.matcher("pq");
		System.out.println("*********************");
		System.out.println(mpq.matches());
		
		Matcher mpqq=pq.matcher("pqq");
		Matcher mpqr=pq.matcher("pqr");
		Matcher mprr=pq.matcher("prr");
		System.out.println(mpqq.matches());
		System.out.println(mpqr.matches());
		System.out.println(mprr.matches());
		System.out.println("*********************");
	}

}
