package array;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		sc.close();
		
		System.out.print("Elements of given array are: ");
		
		System.out.println(Arrays.toString(arr));

	}

}
