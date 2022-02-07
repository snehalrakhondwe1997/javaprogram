package assesment;

import java.util.Scanner;

public class CapitalizeLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		int n = sb.length();
		sb.setCharAt(n-1, Character.toUpperCase(sb.charAt(n-1)));
		System.out.println(sb);
		sc.close();
	
				
				
				
		

	}

}

