package SBA8;

import java.util.LinkedList;
import java.util.ListIterator;

public class Program5 {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("Onion");
		list.add("Tomato");
		list.add("Brinjal");
		list.add("Potato");
		list.add("Cabbage");
		System.out.println("Linkedlist: "+list);
		ListIterator list_iter=list.listIterator(2);
		System.out.println("The list is as follows: ");
		while(list_iter.hasNext()) {
			System.out.println(list_iter.next());
		}
		
	}

}
