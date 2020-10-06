// Linked List Basic Problem;

package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Bangladesh");
		list.add("Pakistan");
		list.add("India");
		list.add("Sri-Lonka");
		list.add("Afganistan");
		list.add(5, "Nepal");
		list.addFirst("America");
		list.addLast("United Kingdom");
		//list.remove("United Kingdom");
		//list.remove(7);
		//list.removeFirst();
		//list.removeLast();
		
		//System.out.println(list);
		for (String NI : list)
		{
			System.out.println(NI);
		}
		System.out.println("Size of LinkedList : "+ list.size());
		System.out.println("First Element : "+ list.getFirst());
		System.out.println("Last Element : "+ list.getLast());
		
		list.clear();
		System.out.println(list);
	}
}
