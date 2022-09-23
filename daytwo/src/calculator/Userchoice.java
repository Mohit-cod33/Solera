package calculator;

import java.util.Scanner;

public class Userchoice {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("enter 1 for Addition : ");
			System.out.println("enter 2 for Subtraction : ");
			System.out.println("enter 3 for multiplication : ");
			System.out.println("enter 4 for Division : ");
			System.out.println("enter 0 to finish the ur operation");
			
			System.out.println();
			System.out.println();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter fiest number :");
			int a=sc.nextInt();
			System.out.println("enter second number :");
			int b=sc.nextInt();
			System.out.println("enter number which operation u want operate");
			
			int n=sc.nextInt();
			
			if(n==0)
				break;
			Opchoice ob=new Opchoice(n,a,b);
			
			System.out.println("**********************-----------******************");
			System.out.println();
		}
		
		
		

	}

}
