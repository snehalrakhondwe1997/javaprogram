package assesment;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {55, 74,  69, 25, 61};
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-1;i++) {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr [i];
					arr[i+1]= temp;
				}
			}
			
		}
			for (int i:arr)
				System.out.println(i);

	}	

}
