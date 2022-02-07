package assesment;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum =0;
		for (int i=1; i<=n;i++ )
			if(n%i ==0) {
				System.out.println("The facotrs of "+n+" are "+i );
						sum += i;
				
			}
		System.out.println("Sum of all factors is " + sum);
		sc.close();
	}
}

		
		
		
