package assesment;

import java.util.Scanner;

public class CountNumChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		int numC = 0;
		int charC = 0;
		for (int i=0;i<s.length();i++){
		char ch= s.charAt(i);
		if (ch>='0' && ch<='9');
		numC++;
		 if ((ch>=65 && ch<=90)||(ch>=97&& ch<=122))charC++;
		

	}
	System.out.println("Number of numrics="+numC);
	System.out.println("Number of character="+charC);
	sc.close();

}
}