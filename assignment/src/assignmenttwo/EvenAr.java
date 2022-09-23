package assignmenttwo;

import java.util.Scanner;

public class EvenAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[10];
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				System.err.print(ar[i]+" ");
		}
	}

}
