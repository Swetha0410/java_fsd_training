/*3.A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
 
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not*/


package SBA7;

import java.util.Scanner;

public class Attendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		double result;
		System.out.println("Enter Number of Classes Held:");
		x=sc.nextInt();
		System.out.println("Enter Number of Classes Attended:");
		y=sc.nextInt();
		result = (double) y/x*100;
		System.out.println("Percentage is:"+result);
		if(result>=75) {
			System.out.println("Student is eligible to allow exam");
		}else {
			System.out.println("Student is not eligible to allow exam");
			}
	}

}
