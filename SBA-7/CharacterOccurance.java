/*6. Write a program to check for the occurrence of a particular character in a string and display how many times it has occurred.
note: 
take the String  and the character to be checked as a input from the user.*/



package SBA7;

import java.io.IOException;
import java.util.Scanner;

public class CharacterOccurance {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		System.out.println("Enter a Character: ");
		char ch = (char)System.in.read();
		int a=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c==ch) {
				a++;
			}
		}
		System.out.println("Characters occurred: "+a);
		
		
	}

}
