package enumclass;

import java.util.Scanner;

enum Days{
	
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	}


public class Switchenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String day=sc.next().toUpperCase();
		switch(Days.valueOf(day)) {
		case MONDAY:
			System.out.println("this is MONDAY");
			break;
		case TUESDAY:
			System.out.println("this is TUESDAY");
			break;
		case WEDNESDAY:
			System.out.println("this is WEDNESDAY");
			break;
		case THURSDAY:
			System.out.println("this is THURSDAY");
			break;
		case FRIDAY:
			System.out.println("this is FRIDAY");
			break;
		case SATURDAY:
			System.out.println("this is SATURDAY");
			break;
		case SUNDAY:
			System.out.println("this is SUNDAY");
			break;
		default:
			System.out.println("this is Invalid day");
		}
	}

}
