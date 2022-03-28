/*2.Write a program that prompts the user to input a positive integer. 
 * It should then print the multiplication table of that number. 
 */


package SBA7;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
