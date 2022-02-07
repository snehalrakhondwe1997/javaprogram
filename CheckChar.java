package assesment;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the character");
		String s  =sc.next();
		boolean flag = true;
		for (int  i=0;i<s.length();i++);
		char ch = s.charAt(0);
		if (ch>='0' && ch<='9');
		flag = false;
	
	if (flag)
		System.out.println("only character");
	System.out.println("String contain number");
	
		

	}

}
