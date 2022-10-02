package assignmentThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Rearrangement {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<StudentPro> l=new ArrayList<StudentPro>();
		int numstud=sc.nextInt();
		
		for(int i=0;i<numstud;i++) {
			l.add(new StudentPro(sc.nextInt(),sc.next(),sc.nextDouble()));
		}
		
		Collections.sort(l,new compst());
		
		for(StudentPro sd:l) {
			System.out.println(sd.getId()+" "+sd.getFname()+" "+sd.getCgpa());
		}
		
	}

}
