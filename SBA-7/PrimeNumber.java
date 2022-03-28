/*1.Write a program that prompts the user to input a positive integer. 
 * It should then output a message indicating whether the number is a prime number.
 */

package SBA7;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int x;
		boolean isPrime=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		sc.close();
		for(int i=2; i <= a/2; i++) {
			x=a%i;
			if(x==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime)
		      System.out.println("It is a Prime Number");
			else
				System.out.println("It is Not a Prime Number");
		}
		
	

}
