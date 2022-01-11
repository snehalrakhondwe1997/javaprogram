import java.util.Scanner;

//package ConditionalStatements;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//int number  = sc.nextInt();
	char ch = '9';
	if(ch >= 'a' && ch <= 'z')
		System.out.println(ch + " is lower case");
    // upper case  number special symbol
	
	else if(ch >= 'A' && ch <= 'Z')
		System.out.println(ch + " is upper case");
	// number special symbol
	
	else if(ch >= '0' && ch<= '9')
		System.out.println(ch + " is a number");
// special symbol
	else
		System.out.println(ch + " is special symbol");

	// if else ladder	


	}

}
