//Hashmap leaarning 
package Hashmap;

import java.util.HashMap;

public class HashmapDemo {
	public static void main(String[] args) {
		//put,get function;
		
		//creating hashmap;
		HashMap <Integer, String> customer = new HashMap <Integer, String>();
		
		customer.put(101, "Anisul");
		customer.put(102, "Saiful");
		customer.put(103, "Suporna");
		customer.put(104, "Pinkey");
		
		
		System.out.println("Customer name: "+ customer.get(103));
	}
}
