package assesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class product{
	int id;
	String name;
	float price;
	product(){
		this.id = 1;
		this.name ="abc";
		this.price = 1.0f;
	}
	product (int id, String name,float price){
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
}

public class Constructor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader (new InputstreamReader(System.in));
		System.out.println("Enetr id,name &price of product");
		int id = Integer .parseInt(br.readLine());
		String name = br.readLine();
		float price = Float.parseFloat(br.readLine());
		product p1 = new product (id ,name,price);
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.price);
		product p2 = new product(id,name,price);
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.price);
		
		
		
		

	}

}
