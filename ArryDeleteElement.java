package assesment;

import java.util.Scanner;

public class ArryDeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arry");
		int n = sc.nextInt();
		int []arr= new int[n];
		System.out.println("Eneter arry elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

	}

}
