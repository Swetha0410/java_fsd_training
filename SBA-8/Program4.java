package SBA8;

import java.util.ArrayList;
import java.util.Iterator;



public class Program4 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Toyota");
		list.add("Suzuki");
		list.add("Skoda");
		list.add("Tata");
		list.add("Audi");
		System.out.println("The elements in ArrayList are: "+list);
		list.remove(3);
		System.out.println("The contents of list after removing the element at 5th position is: "+list);
		Iterator<String>iter=list.iterator();
		System.out.println("\n The iterator values"+" of list are: ");
		while(iter.hasNext()) {
			System.out.println(iter.next()+" ");
		}
		
		
	}

}
