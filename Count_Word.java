package assesment;

import java.util.Scanner;

public class Count_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		String s= "Hello how are you";
	
		int  c =0;
		for(int i = 0;i<s.length();i++) {
		if(s.charAt(i)==' ')
			c++;
	}
	System.out.println("Total number of words:" + ++c);
	}


	}


