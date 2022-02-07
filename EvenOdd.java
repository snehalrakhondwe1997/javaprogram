package assesment;


import java.io.IOException;

public class EvenOdd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputstreamReader(System.in));
		System.out.println("Enter a number");
		int n = Integer.paeseInt(br.readLine());
		String result = (n%2 == 0)?"even":"odd";
		System.out.println("The given number is"+ result);
		

	}

}
