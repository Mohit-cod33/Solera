package assignmentThree;

import java.util.Scanner;

public class Rearrangement {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int numstud=sc.nextInt();
		int id[]=new int[numstud];
		String name[]=new String[numstud];
		double cgpa[]=new double[numstud];
		for(int i=0;i<numstud;i++) {
			id[i]=sc.nextInt();
			name[i]=sc.next();
			cgpa[i]=sc.nextDouble();
		}
		for(int i=0;i<numstud;i++) {
			StudentPro sp=new StudentPro(id[i]);
		}
	}

}
