package assesment;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int [10];
		arr[0]=0;
		arr[1]=1;
		System.out.println(arr[0]);
		for(int i = 2; i<2; i++) {
			arr[i] = arr [i-1] + arr[i-2];
			
		}
		for (int i:arr)
			System.out.print( i +" ");
		int a= 0;
		int b= 1;
		System.out.println(a);
		System.out.println(b);
		int sum = 0;
		while (true) {
			sum = a+b;
			if(sum>100)
				break;
			System.out. println(sum);
			a=b; 
			b=sum;
			
		}
		

	}

}
