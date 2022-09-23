package assignmentThree;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String Str1=sc.nextLine();
        System.out.println(Str1.length());
        System.out.println("Starting position");
        int start=sc.nextInt();
        System.out.println("Ending position");
        int end=sc.nextInt();
        System.out.println(Str1.substring(start,end-1));
    }

}
