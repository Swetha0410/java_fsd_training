//2.Take the number input from console and add all the positive numbers.(not to consider the negative number if entered)
package SBA1;

import java.util.Scanner;

public class SBA1b {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter numbers: ");
		while(true) {
			int n = sc.nextInt();
			if(n < 0) 
				break;
			  sum += n;
			}
		System.out.println("Sum is : "+ sum);

		
	}
}

