package assesment;

import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the word:");
		
		String str = in.nextLine();
		str =str.toLowerCase();
		String newstr ="";
		int len = str.length();
		
		for (int i=0;i<len;i++) {
			char ch = str.charAt(i);
			
			if (str.charAt(i) == 'a'||
					str.charAt(i) == 'e'||
					str.charAt(i) == 'i'||
					str.charAt(i) == 'o'||
					str.charAt(i) == 'u') {
				char nextchar = (char)(ch+1);
				newstr = newstr + nextchar;
			}
			else {
				newstr = newstr + ch;
				
			}
		}
		
		
		
		System.out.println(newstr);
		
		

	}

}
