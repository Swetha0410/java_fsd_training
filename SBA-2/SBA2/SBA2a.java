// Write a program to reverse the String(use char[] or String built in method)
package SBA2;

public class SBA2a {
	public static void main(String[] args) {
		String s = "This is a string statement";
		StringBuilder s1 = new StringBuilder();
		s1.append(s);
		s1.reverse();
		System.out.println(s1);
	}

}
